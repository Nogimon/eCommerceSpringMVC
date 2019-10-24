package LD.springmvcshoppingcart.dao;

import java.util.List;

import LD.springmvcshoppingcart.model.CartInfo;
import LD.springmvcshoppingcart.model.OrderDetailInfo;
import LD.springmvcshoppingcart.model.OrderInfo;
import LD.springmvcshoppingcart.model.PaginationResult;
 
public interface OrderDAO {
 
    public void saveOrder(CartInfo cartInfo);
 
    public PaginationResult<OrderInfo> listOrderInfo(int page,
            int maxResult, int maxNavigationPage);
    
    public OrderInfo getOrderInfo(String orderId);
    
    public List<OrderDetailInfo> listOrderDetailInfos(String orderId);
 
}