package com.sac.dao;
 
import java.util.List;
 
import com.sac.model.CartInfo;
import com.sac.model.OrderDetailInfo;
import com.sac.model.OrderInfo;
import com.sac.model.PaginationResult;
 
public interface OrderDAO {
 
    public void saveOrder(CartInfo cartInfo);
 
    public PaginationResult<OrderInfo> listOrderInfo(int page,
            int maxResult, int maxNavigationPage);
    
    public OrderInfo getOrderInfo(String orderId);
    
    public List<OrderDetailInfo> listOrderDetailInfos(String orderId);
 
}