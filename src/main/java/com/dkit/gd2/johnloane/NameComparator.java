package com.dkit.gd2.johnloane;

import java.util.Comparator;

public class NameComparator implements Comparator<Student>
{
    private SortType sortType;

    public NameComparator(SortType sortType)
    {
        this.sortType = sortType;
    }

    @Override
    public int compare(Student vg1, Student vg2)
    {
        return vg1.getName().compareTo(vg2.getName());
    }
}