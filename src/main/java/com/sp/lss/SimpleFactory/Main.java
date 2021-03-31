package com.sp.lss.SimpleFactory;

/**
 * 这里是测试方法
 */
public class Main {
    public static void main(String[] args) throws Exception {
        CreatePeopleFactory cpf=new CreatePeopleFactory();
        BlackPeople blackpeople = (BlackPeople) cpf.createPeople("blackeople");
        blackpeople.showMe();
    }
}
