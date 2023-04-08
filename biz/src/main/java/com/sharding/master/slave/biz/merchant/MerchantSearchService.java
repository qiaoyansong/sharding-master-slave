package com.sharding.master.slave.biz.merchant;

import com.sharding.master.slave.common.es.bean.SearchResult;
import com.sharding.master.slave.api.param.merchant.MerchantSearchParam;
import com.sharding.master.slave.api.result.merchant.MerchantSearchItem;

import java.util.Map;

/**
 * @author ：Qiao Yansong
 * @date ：Created in 2022/1/27 11:55 上午
 * description：
 */
public interface MerchantSearchService {

    /**
     * 搜索商户
     * @param  searchParam searchParam
     * @return result
     */
    SearchResult<MerchantSearchItem> searchMerchant(MerchantSearchParam searchParam);

    /**
     * upsert商户所索引
     *
     * @param productLine productLine
     * @param merchantId  merchantId
     * @param data        data
     * @return bool
     */
    boolean upsertMerchantDoc(Integer productLine, Long merchantId, Map<String, Object> data);

    /**
     * delete商户索引
     *
     * @param productLine productLine
     * @param merchantId  merchantId
     * @return bool
     */
    boolean deleteMerchantDoc(Integer productLine, Long merchantId);

    /**
     * delete商户索引
     *
     * @param productLine productLine
     * @param merchantId  merchantId
     * @return bool
     */
    boolean deleteMerchantDoc(Integer productLine, Long merchantId,String indexName);

    /**
     * index商户索引
     *
     * @param productLine productLine
     * @param merchantId  merchantId
     * @param data        data
     * @return bool
     */
    boolean indexMerchantDoc(Integer productLine, Long merchantId, String data);
}
