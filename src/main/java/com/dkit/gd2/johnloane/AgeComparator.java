package com.dkit.gd2.johnloane;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student>
{
    private SortType sortType;

    public AgeComparator(SortType sortType)
    {
        this.sortType = sortType;
    }

    @Override
    public int compare(Student vg1, Student vg2)
    {
        int direction = sortType.getValue();
        return direction * (vg1.getAge() - vg2.getAge());
    }
}