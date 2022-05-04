package com.example.service;

import com.example.entity.SinhVienEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface SvService {
    List<SinhVienEntity> findAll();
    SinhVienEntity save(SinhVienEntity sv);
    SinhVienEntity update(SinhVienEntity sv);
    void delete(SinhVienEntity sv);
    List<SinhVienEntity> findByName(String name);
    List<SinhVienEntity> findByMssv(String mssv);
    List<SinhVienEntity> findByGioiTinhOrderByNameAsc(String gioiTinh);
}
