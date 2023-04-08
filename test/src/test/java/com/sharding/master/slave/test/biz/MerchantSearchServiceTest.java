package com.sharding.master.slave.test.biz;

import com.sharding.master.slave.api.result.merchant.MerchantSearchItem;
import com.sharding.master.slave.biz.merchant.MerchantSearchService;
import com.sharding.master.slave.common.es.bean.SearchResult;
import com.sharding.master.slave.api.param.merchant.MerchantSearchParam;
import com.sharding.master.slave.test.BaseTestApplication;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author ：Qiao Yansong
 * @date ：Created in 8/18/22 7:44 下午
 * description：
 */
public class MerchantSearchServiceTest extends BaseTestApplication {

    @Autowired
    private MerchantSearchService merchantSearchService;

    @Test
    public void testSearchMerchant() {
        MerchantSearchParam merchantSearchParam = new MerchantSearchParam();
        merchantSearchParam.setPageNum(1);
        merchantSearchParam.setPageSize(2);
        merchantSearchParam.setMerchantName("商户");
        SearchResult<MerchantSearchItem> merchantSearchItemSearchResult = merchantSearchService.searchMerchant(merchantSearchParam);
        System.out.println(merchantSearchItemSearchResult);
    }

}
