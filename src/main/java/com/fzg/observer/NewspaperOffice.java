package com.fzg.observer;

import java.util.ArrayList;
import java.util.List;

public class NewspaperOffice {
    // 存储所有观察者列表
    private List<Customer> customers = new ArrayList<>();
    // 增加观察者
    public void addCustomer(Customer customer){
        customers.add(customer);
    }
    // 通知所有观察者
    public void notifyAllObservers(){
        for (Customer customer : customers) {
            customer.update();
        }
    }
    // 发送消息
    public void newspaper(){
        this.notifyAllObservers();
    }
}
