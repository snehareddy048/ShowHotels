package com.example.snehaanandyeluguri.showhotels.view;

import com.example.snehaanandyeluguri.showhotels.models.CityListData;

import java.util.List;

public interface MainView {

     void showProgress();

     void removeProgress();

     void showError(String errorMessage);

     void showInformation(List<CityListData> cityListDataList);

}
