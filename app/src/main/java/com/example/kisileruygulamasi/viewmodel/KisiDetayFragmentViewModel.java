package com.example.kisileruygulamasi.viewmodel;

import android.util.Log;

import androidx.lifecycle.ViewModel;

import com.example.kisileruygulamasi.repo.KisilerDaoRepository;

public class KisiDetayFragmentViewModel extends ViewModel {
    private KisilerDaoRepository krepo = new KisilerDaoRepository();

    public void guncelle(int kisi_id,String kisi_ad,String kisi_tel){
        krepo.kisiGuncelle(kisi_id,kisi_ad,kisi_tel);
    }
}
