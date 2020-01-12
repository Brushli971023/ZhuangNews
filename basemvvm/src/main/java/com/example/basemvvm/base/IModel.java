package com.example.basemvvm.base;

/**
 * @author AZhung
 * @date 2020/1/12
 * @description
 */
public interface IModel {
    /**
     * ViewModel销毁时清除Model，与ViewModel共消亡。Model层同样不能持有长生命周期对象
     */
    void onCleared();
}
