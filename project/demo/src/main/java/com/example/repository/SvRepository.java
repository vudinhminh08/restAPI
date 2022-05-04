package com.example.repository;

import com.example.entity.SinhVienEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SvRepository extends JpaRepository<SinhVienEntity, String> {
    List<SinhVienEntity> findByName(String name);
    List<SinhVienEntity> findByMssv(String mssv);
    List<SinhVienEntity> findByGioiTinhOrderByNameAsc(String gioiTinh);

}
