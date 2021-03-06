package com.crazysunj.domain.repository.photo;

import com.crazysunj.domain.entity.photo.BucketEntity;
import com.crazysunj.domain.entity.photo.MediaEntity;

import java.util.List;

import io.reactivex.Flowable;

/**
 * author: sunjian
 * created on: 2018/9/17 下午2:49
 * description:
 */
public interface PhotoPickerRepository {
    Flowable<MediaEntity.MediaResponseData> getMediaList(int imageOffset, int videoOffset, String bucketId);

    Flowable<List<BucketEntity>> getBucketList();
}
