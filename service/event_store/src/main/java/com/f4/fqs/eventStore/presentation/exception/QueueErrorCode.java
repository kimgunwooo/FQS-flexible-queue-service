package com.f4.fqs.eventStore.presentation.exception;

import com.f4.fqs.commons.domain.exception.ErrorCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum QueueErrorCode implements ErrorCode {
    // Common
    INVALID_INPUT_VALUE(400, "COMMON_0001", "잘못된 입력 값입니다."),
    INTERNAL_SERVER_ERROR(500, "COMMON_002", "서버 에러입니다."),

    // Security
    NOT_AUTHORIZATION(403, "SECURITY_001", "권한이 없습니다."),

    // Queue
    QUEUE_NAME_DUPLICATE(409, "QUEUE_001", "이미 존재하는 대기열 이름입니다."),

    // QueuePackage
    QUEUE_PACKAGE_NOT_FOUND(404, "QUEUE_PACKAGE_001", "존재하지 않는 대기열 패키지 입니다."),

    // QueueBean
    QUEUE_BEAN_NOT_FOUND(404, "QUEUE_BEAN_001", "존재하지 않는 대기열 Bean 입니다."),
    ;

    private final int status;
    private final String code;
    private final String message;
}
