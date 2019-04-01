package com.camelot.springboot.pojo;

/**
 * @ClassName Forte
 * @Description TODO
 * @Author admin
 * @Date 2019/3/12 18:58
 * @Version 1.0
 */
public class Forte {
    private String name;
    private Integer time;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Forte{" +
                "name='" + name + '\'' +
                ", time=" + time +
                '}';
    }
}
