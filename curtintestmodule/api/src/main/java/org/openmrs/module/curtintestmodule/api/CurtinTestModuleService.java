/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.CurtinTestModule.api;

import org.openmrs.api.OpenmrsService;
import org.springframework.transaction.annotation.Transactional;

/**
 * The service for managing departments.
 */
@Transactional
public interface DepartmentService extends OpenmrsService {
        /**
         * Gets a list of departments.
         *
         * @return the department list.
         */
        @Transactional(readOnly = true)
        List<Department> getAllDepartments();
        /**
         * Gets a department for a given id.
         *
         * @param id the department id
         * @return the department with the given id
         */
        @Transactional(readOnly = true)
        Department getDepartment(Integer departmentId);
        /**
         * Saves a new or existing department.
         *
         * @param department the department to save.
         * @return the saved department.
         */
        Department saveDepartment(Department department);
        /**
         * Deletes a department from the database.
         *
         * @param department the department to delete.
         */
        void purgeDepartment(Department department);
}