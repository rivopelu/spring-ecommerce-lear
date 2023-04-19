package com.eccomercebelajar.eccomerceapi.helper;


import com.eccomercebelajar.eccomerceapi.model.response.BaseResponse;
import com.eccomercebelajar.eccomerceapi.model.response.BaseResponsePagination;
import com.eccomercebelajar.eccomerceapi.model.response.BaseResponseSlice;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Slice;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseHelper {
    public static ResponseEntity<BaseResponse> buildOkResponse(Object data) {
        BaseResponse mainResponse = BaseResponse.builder()
                .data(data)
                .success(true).build();

        return ResponseEntity.ok(mainResponse);
    }

    public static ResponseEntity<BaseResponse> buildOkResponse() {
        BaseResponse mainResponse = BaseResponse.builder()
                .success(true).build();

        return ResponseEntity.ok(mainResponse);
    }

    public static ResponseEntity<BaseResponse> buildOkResponse(String data) {
        BaseResponse mainResponse = BaseResponse.builder()
                .data(data)
                .success(true).build();

        return ResponseEntity.ok(mainResponse);
    }

    public static <T> ResponseEntity<BaseResponsePagination> buildOkResponsePage(Page<T> data) {
        BaseResponsePagination mainResponse = BaseResponsePagination.builder()
                .data(data.getContent())
                .page(data.getNumber())
                .allElement(data.getTotalElements())
                .element(data.getSize())
                .success(true).build();

        return ResponseEntity.ok(mainResponse);
    }

    public static <T> ResponseEntity<BaseResponseSlice> buildOkeResponse(Slice<T> data) {
        return ResponseEntity.ok(ResponseHelper.buildSliceResponse(data));
    }

    public static <T> BaseResponseSlice buildSliceResponse(Slice<T> data) {
        return BaseResponseSlice.builder()
                .data(data.get())
                .hasNext(data.hasNext())
                .isFirst(data.isFirst())
                .isLast(data.isLast())
                .success(true)
                .build();
    }

    public static ResponseEntity<BaseResponse> buildCreatedResponse(String data) {
        BaseResponse mainResponse = BaseResponse.builder()
                .data(data)
                .success(true).build();
        return ResponseEntity.status(HttpStatus.CREATED).body(mainResponse);
    }

    public static ResponseEntity<BaseResponse> buildNoDataResponse(String message) {
        BaseResponse mainResponse = BaseResponse.builder()
                .data(message)
                .success(false).build();

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(mainResponse);
    }

    public static ResponseEntity<BaseResponse> buildInternalServerErrorResponse(String message) {
        BaseResponse mainResponse = BaseResponse.builder()
                .data(message)
                .success(false).build();
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(mainResponse);
    }

    public static ResponseEntity<BaseResponse> buildBadRequestResponse(String message) {
        BaseResponse mainResponse = BaseResponse.builder()
                .success(false)
                .data(message).build();

        return ResponseEntity.status(HttpStatus.BAD_REQUEST.value()).body(mainResponse);
    }

    public static ResponseEntity<BaseResponse> buildUnauthorizedResponse(String message) {
        BaseResponse mainResponse = BaseResponse.builder()
                .success(false)
                .data(message).build();

        return ResponseEntity.status(HttpStatus.UNAUTHORIZED.value()).body(mainResponse);
    }

}