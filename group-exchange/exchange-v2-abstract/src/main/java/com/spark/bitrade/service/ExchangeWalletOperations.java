package com.spark.bitrade.service;

import com.spark.bitrade.entity.ExchangeWallet;
import com.spark.bitrade.entity.ExchangeWalletSyncRecord;
import com.spark.bitrade.entity.ExchangeWalletWalRecord;

import java.util.List;
import java.util.Optional;

/**
 * 钱包操作接口
 *
 * @author Archx[archx@foxmail.com]
 * @since 2019/9/2 16:01
 */
public interface ExchangeWalletOperations {

    /**
     * 获取钱包余额
     *
     * @param memberId 会员id
     * @param coinUnit 币种
     * @return wallet
     */
    Optional<ExchangeWallet> balance(Long memberId, String coinUnit);

    /**
     * 预记录日志
     *
     * @param record 记录
     * @return optional
     */
    Optional<ExchangeWalletWalRecord> booking(ExchangeWalletWalRecord record);

    /**
     * 同步日志
     *
     * @param ids    日志ids
     * @param record 同步记录
     * @return optional
     */
    @Deprecated
    Optional<ExchangeWalletSyncRecord> sync(List<Long> ids, ExchangeWalletSyncRecord record);

    /**
     * 同步操作
     *
     * @param memberId 会员id
     * @param coinUnit 币种
     * @return optional
     */
    Optional<ExchangeWalletSyncRecord> sync(Long memberId, String coinUnit);
}
