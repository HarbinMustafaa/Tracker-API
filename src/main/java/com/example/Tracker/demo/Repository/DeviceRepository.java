package com.example.Tracker.demo.Repository;

import com.example.Tracker.demo.Model.Device;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceRepository extends JpaRepository<Device,Long> {

}
