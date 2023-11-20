package com.cloudofgoods.common;

import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.HashMap;
import java.util.Map;

public enum ErrorCode {
    MISSING_SECRET, INVALID_SECRET, MISSING_RESPONSE, INVALID_RESPONSE, BAD_REQUEST, TIME_OUT_DUPLICATION;

    private static final Map<String, ErrorCode> errorsMap = new HashMap<>(6);

    static {
        errorsMap.put("missing-input-secret", MISSING_SECRET);
        errorsMap.put("invalid-input-secret", INVALID_SECRET);
        errorsMap.put("missing-input-response", MISSING_RESPONSE);
        errorsMap.put("invalid-input-response", INVALID_RESPONSE);
        errorsMap.put("bad-request", BAD_REQUEST);
        errorsMap.put("timeout-or-duplicate", TIME_OUT_DUPLICATION);
    }

    @JsonCreator
    public static ErrorCode forValue(final String value) {
        return errorsMap.get(value.toLowerCase());
    }
}