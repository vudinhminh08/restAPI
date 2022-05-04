package com.example.service;

import com.example.entity.SinhVienEntity;
import com.example.repository.SvRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class SvServiceImpl  implements SvService{
    @Autowired
    private SvRepository svRepository;
    @Override
    public SinhVienEntity save(SinhVienEntity sv) {
        return svRepository.save(sv);
    }
    @Override
    public SinhVienEntity update(SinhVienEntity sv) {
        return svRepository.save(sv);
    }
    @Override
    public List<SinhVienEntity> findAll() {
        return svRepository.findAll();
    }
    @Override
    public void delete(SinhVienEntity sv) {
        svRepository.delete(sv);
    }
    @Override
    public List<SinhVienEntity> findByName(String name) {
        return svRepository.findByName(name);
    }
    @Override
    public List<SinhVienEntity> findByMssv(String mssv) {
        return svRepository.findByMssv(mssv);
    }
    @Override
    public List<SinhVienEntity> findByGioiTinhOrderByNameAsc(String gioiTinh) {
        return svRepository.findByGioiTinhOrderByNameAsc(gioiTinh);
    }
//    public List<SinhVienEntity> sortByName() {
//        List<SinhVienEntity> listSv = new ArrayList<SinhVienEntity>();
//        listSv = svRepository.findAll();
//        for(int i=0; i< listSv.size(); i++) {
//            if(listSv.get(i).getGioiTinh() == "Nam") {
//                listSv.remove(i);
//            }
//        }
//        Collections.sort(listSv, new Comparator<SinhVienEntity>() {
//            public int compare(SinhVienEntity sv1, SinhVienEntity sv2) {
//                if (sv1.getName().compareTo(sv2.getName()) <0) {
//                    return 1;
//                } else {
//                    if (sv1.getName() == sv2.getName()) {
//                        return 0;
//                    } else {
//                        return -1;
//                    }
//                }
//            }
//        });
//
//        return listSv;
//
//
//    }
}
