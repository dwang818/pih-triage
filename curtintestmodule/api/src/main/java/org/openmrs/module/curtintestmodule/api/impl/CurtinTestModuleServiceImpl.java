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
package org.openmrs.module.curtintestmodule.api.impl;

import org.openmrs.api.impl.BaseOpenmrsService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.module.curtintestmodule.api.CurtinTestModuleService;
import org.openmrs.module.curtintestmodule.api.db.CurtinTestModuleDAO;

/**
 * It is a default implementation of {@link DepartmentService}.
 */
public class DepartmentServiceImpl extends BaseOpenmrsService implements DepartmentService {
        protected final Log log = LogFactory.getLog(this.getClass());
        private DepartmentDAO dao;
        /**
         * @param dao the dao to set
         */
        public void setDao(DepartmentDAO dao) {
                this.dao = dao;
        }
        /**
         * @return the dao
         */
        public DepartmentDAO getDao() {
                return dao;
        }
        /**
         * @see org.openmrs.module.department.api.DepartmentService#getAllDepartments()
         */
        @Override
        public List<Department> getAllDepartments() {
                return dao.getAllDepartments();
        }
        /**
         * @see org.openmrs.module.department.api.DepartmentService#getDepartment(java.lang.Integer)
         */
        @Override
    public Department getDepartment(Integer departmentId) {
            return dao.getDepartment(departmentId);
    }
        /**
         * @see org.openmrs.module.department.api.DepartmentService#saveDepartment(org.openmrs.module.department.Department)
         */
        @Override
        public Department saveDepartment(Department department) {
                return dao.saveDepartment(department);
        }
        /**
         * @see org.openmrs.module.department.api.DepartmentService#purgeDepartment(org.openmrs.module.department.Department)
         */
        @Override
        public void purgeDepartment(Department department) {
                dao.purgeDepartment(department);
        }
}  