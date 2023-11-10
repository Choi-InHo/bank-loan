package com.fastcampus.loan.service;

import com.fastcampus.loan.dto.BalanceDTO.CreateRequest;
import com.fastcampus.loan.dto.BalanceDTO.RepaymentRequest;
import com.fastcampus.loan.dto.BalanceDTO.Response;
import com.fastcampus.loan.dto.BalanceDTO.UpdateRequest;

public interface BalanceService {

    Response create(Long applicationId, CreateRequest request);

    Response get(Long applicationId);

    Response update(Long applicationId, UpdateRequest request); //집행 변경에 의한 업데이트

    Response repaymentUpdate(Long applicationId, RepaymentRequest request); // 상환을 했을때 잔고 변경

    void delete(Long applicationId);
}