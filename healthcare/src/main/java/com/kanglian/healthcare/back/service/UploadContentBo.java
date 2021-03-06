package com.kanglian.healthcare.back.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.easyway.business.framework.util.DateUtil;
import com.kanglian.healthcare.back.dao.HealthNewsDao;
import com.kanglian.healthcare.back.dao.UploadContentDao;
import com.kanglian.healthcare.back.pojo.HealthNews;
import com.kanglian.healthcare.back.pojo.UploadContent;
import com.kanglian.healthcare.back.pojo.UserDoctor;
import com.kanglian.healthcare.common.NewCrudBo;
import com.kanglian.healthcare.exception.DBException;

@Service
public class UploadContentBo extends NewCrudBo<UploadContent, UploadContentDao> {

    @Autowired
    private UserDoctorBo userDoctorBo;
    @Autowired
    private HealthNewsDao healthNewsDao;
    
    public List<UploadContent> getByPubId(String pubId) {
        try {
            return this.dao.getByPubId(pubId);
        } catch (Exception ex) {
            throw new DBException(ex);
        }
    }

    public void deleteByPubId(String pubId) {
        try {
            this.dao.deleteByPubId(pubId);
        } catch (Exception ex) {
            throw new DBException(ex);
        }
    }

    public int updateByPubId(UploadContent content) {
        try {
            return this.dao.updateByPubId(content);
        } catch (Exception ex) {
            throw new DBException(ex);
        }
    }
    
    /**
     * 删除上传文件
     * 
     * @param arr
     * @return
     */
    public int deleteContent(int[] arr) {
        try {
            return this.dao.deleteContent(arr);
        } catch (Exception ex) {
            throw new DBException(ex);
        }
    }
    
    /**
     * 保存上传资讯
     * 
     * @param uploadContent
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public void saveUploadContent(final UploadContent uploadContent) throws Exception {
        try {
            this.dao.save(uploadContent);
            UserDoctor userDoctor = userDoctorBo.getDoctorInfoById(uploadContent.getUserId());
            if (userDoctor != null) {
                HealthNews healthNews = new HealthNews();
                healthNews.setUserId(uploadContent.getUserId());
                healthNews.setAddTime(DateUtil.currentDate());
                if (uploadContent.getType() == 1) {// 视频
                    healthNews.setNewsTypeId(9);
                    healthNews.setNewsName("视频");
                    healthNews.setPhotoAddress(uploadContent.getPic());
                } else {// 图文
                    healthNews.setNewsTypeId(8);
                    healthNews.setNewsName("图文");
                    healthNews.setPhotoAddress(uploadContent.getSrc());
                }
                healthNews.setPrice(uploadContent.getPrice());
                healthNews.setPutOn(1);
                healthNews.setCommend(1);
                healthNews.setArticle(uploadContent.getContent());
                healthNews.setNewsAuthor(userDoctor.getDoctorName());
                healthNews.setAuthorProfer(userDoctor.getPositional());
                healthNews.setAuthorHos(userDoctor.getHospitalName());
                healthNews.setAuthorDept(userDoctor.getDeptName());
                healthNewsDao.save(healthNews);
            }
        } catch (Exception ex) {
            throw new DBException(ex);
        }
    }
}
