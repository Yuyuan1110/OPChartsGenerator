package com.acomnetworks.opchartsgenerator.service;
import org.jfree.data.category.DefaultCategoryDataset;

public interface DataFetcher {
    DefaultCategoryDataset fetchData();
}
