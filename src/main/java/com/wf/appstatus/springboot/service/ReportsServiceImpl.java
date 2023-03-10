package com.wf.appstatus.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.wf.appstatus.springboot.model.SoftwareUpdateReport;
import com.wf.appstatus.springboot.repository.ReportsRepository;

@Service
public class ReportsServiceImpl implements ReportsService {

	@Autowired
	private ReportsRepository reportsRepository;

	@Override
	public SoftwareUpdateReport getSoftwareUpdateStatusById(long id) {
		Optional<SoftwareUpdateReport> optional = reportsRepository.findById(id);
		SoftwareUpdateReport software = null;
		if (optional.isPresent()) {
			software = optional.get();
		} else {
			throw new RuntimeException("SoftwareUpdateStatus not found for id :: " + id);
		}
		return software;
	}
	
	@Override
	public SoftwareUpdateReport saveSoftwareUpdateReport(SoftwareUpdateReport report) {
		return this.reportsRepository.save(report);
	}
	
	@Override
	public List<SoftwareUpdateReport> getAllReports(String keyword) {
		if (keyword != null) {
            return reportsRepository.searchReport(keyword);
        }
		return reportsRepository.findAll();
	}
	
	@Override
	public Page<SoftwareUpdateReport> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection) {
		Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending()
				: Sort.by(sortField).descending();

		Pageable pageable = PageRequest.of(pageNo - 1, pageSize, sort);
		return this.reportsRepository.findAll(pageable);
	}
}
