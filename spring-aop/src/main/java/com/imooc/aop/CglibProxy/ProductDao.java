package com.imooc.aop.CglibProxy;

public class ProductDao {
    public void save() {
        System.out.println("保存");
    }

    public void update() {
        System.out.println("更新");
    }

    public void delete() {
        System.out.println("删除");
    }

    public void find() {
        System.out.println("查找");
    }
}
