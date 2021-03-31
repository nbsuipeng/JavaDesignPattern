package com.sp.lss.SimpleFactory;

/**
 * 工厂方法，用来生产人类
 */
public class CreatePeopleFactory {
    public CreatePeopleFactory() {
    }
    public Object createPeople(String people) throws Exception {
        if(people.equalsIgnoreCase("blackpeople"))
            return new BlackPeople();
        if(people.equalsIgnoreCase("whitepeople"))
            return new WhitePeople();
        if(people.equalsIgnoreCase("yellowpeople"))
            return new YellowPeople();
        throw new PeopleCannotCreateException("没有此类people可以创建："+people);
    }
}
