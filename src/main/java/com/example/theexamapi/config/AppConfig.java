package com.example.theexamapi.config;

import com.example.theexamapi.controller.*;
import com.example.theexamapi.cors.CORSFilter;
import com.example.theexamapi.repo.ClassRepository;
import com.example.theexamapi.repo.CourseRepository;
import com.example.theexamapi.repo.DepartmentRepository;
import com.example.theexamapi.repo.StreamRepository;
import com.example.theexamapi.repositories.TCourseRepository;
import com.example.theexamapi.repositories.TDepartmentRepository;
import com.example.theexamapi.repositories.TStreamRepository;
import com.example.theexamapi.service.*;
import com.example.theexamapi.service.impl.*;
import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;

public class AppConfig extends ResourceConfig {

	public AppConfig() {
		registerResources();

		// Now you can expect validation errors to be sent to the
		// client.
		property(ServerProperties.BV_SEND_ERROR_IN_RESPONSE, true);
	}
	public void registerResources() {
		register(CORSFilter.class);

		register(StreamResource.class);
		register(new AbstractBinder() {
			@Override
			protected void configure() {
				bind(StreamServiceImpl.class).to(StreamService.class);
				bind(StreamRepository.class).to(StreamRepository.class);
			}
		});

		register(CourseResource.class);
		register(new AbstractBinder() {
			@Override
			protected void configure() {
				bind(CourseServiceImpl.class).to(CourseService.class);
				bind(CourseRepository.class).to(CourseRepository.class);
			}
		});

		register(DepartmentResource.class);
		register(new AbstractBinder() {
			@Override
			protected void configure() {
				bind(DepartmentServiceImpl.class).to(DepartmentService.class);
				bind(DepartmentRepository.class).to(DepartmentRepository.class);
			}
		});

		register(ClassResource.class);
		register(new AbstractBinder() {
			@Override
			protected void configure() {
				bind(ClassServiceImpl.class).to(ClassService.class);
				bind(ClassRepository.class).to(ClassRepository.class);
			}
		});

		register(TStreamResource.class);
		register(new AbstractBinder() {
			@Override
			protected void configure() {
				bind(TStreamServiceImpl.class).to(TStreamService.class);
				bind(TStreamRepository.class).to(TStreamRepository.class);
			}
		});
		register(TCourseResource.class);
		register(new AbstractBinder() {
			@Override
			protected void configure() {
				bind(TCourseServiceImpl.class).to(TCourseService.class);
				bind(TCourseRepository.class).to(TCourseRepository.class);
			}
		});
		register(TDepartmentResource.class);
		register(new AbstractBinder() {
			@Override
			protected void configure() {
				bind(TDepartmentServiceImpl.class).to(TDepartmentService.class);
				bind(TDepartmentRepository.class).to(TDepartmentRepository.class);
			}
		});
	}
}