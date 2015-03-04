package me.graduation.infrastructure.persistence.hibernate;

import me.graduation.domain.model.permission.IPermissionRepository;
import me.graduation.domain.model.permission.Permission;
import me.graduation.infrastructure.persistence.hibernate.generic.AbstractHibernateGenericRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by _liwenhe on 2015/3/4.
 */
@Repository("permissionRepository")
public class PermissionRepository extends AbstractHibernateGenericRepository<Permission, String> implements IPermissionRepository<Permission, String> {
}
