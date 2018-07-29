package com.peng.manager.service;

import com.peng.common.pojo.DataGridResult;
import com.peng.common.pojo.E3Result;
import com.peng.manager.pojo.TbItem;

/**
 * 商品管理 Service
 *
 * @author renyapeng
 * @date 2018/04/23
 */
public interface ItemService {

    /**
     * 根据商品 id 查询商品信息
     *
     * @author renyapeng
     * @date 2018/05/12
     */
    TbItem getItemById(Long itemId);

    /**
     * 分页查询所有商品列表
     *
     * @author renyapeng
     * @date 2018/05/12
     */
    DataGridResult getItemListDataGrid(int page, int rows);

    /**
     * 商品添加
     *
     * @author renyapeng
     * @date 2018/07/14
     */
    E3Result addItem(TbItem item, String desc);
}
