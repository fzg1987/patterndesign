package com.fzg.observer;

public class Test {
    public static void main(String[] args) {
        // 报社
        NewspaperOffice newspaperOffice = new NewspaperOffice();
        CustomerA customerA = new CustomerA();
        CustomerB customerB = new CustomerB();
        // 添加客户
        newspaperOffice.addCustomer(customerA);
        newspaperOffice.addCustomer(customerB);
        // 送报纸
        newspaperOffice.newspaper();
    }
}
