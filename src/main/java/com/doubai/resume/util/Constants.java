package com.doubai.resume.util;

public class Constants {

    // HTTP type
    public static final String CONTENT_DISPOSITION = "Content-Disposition";
    public static final String CONTENT_TYPE_JSON = "application/json;charset=utf-8";
    public static final String CONTENT_TYPE_FORM_URL = "application/x-www-form-urlencoded;charset=UTF-8";
    public static final String CONTENT_TYPE_PNG = "image/png";
    public static final String CONTENT_TYPE_MIXED = "multipart/mixed ";
    public static final String CONTENT_TYPE_ALTERNATIVE = "multipart/alternative";
    public static final String CONTENT_TYPE_RELATED = "multipart/related";
    public static final String CONTENT_TYPE_FORM_DATA = "multipart/form-data";
    public static final String CONTENT_TYPE_EXCEL_XLS = "application/vnd.ms-excel";
    public static final String CONTENT_TYPE_EXCEL_XLSX = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";

    // security
    public static final String SECRET = "SECRET_KEY";
    public static final long EXPIRATION_TIME = 900_000; // 15 mins
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
    public static final String AUTHENTICATE_URL = "/api/authenticate";
    public static final String LOGIN_URL = "/api/login";
    public static final String REGISTER_URL = "/api/register";
}
