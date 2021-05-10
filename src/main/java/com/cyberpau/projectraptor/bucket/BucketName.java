package com.cyberpau.projectraptor.bucket;

public enum BucketName {
    PROFILE_IMAGE("<aws-s3-bucket-name>");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
