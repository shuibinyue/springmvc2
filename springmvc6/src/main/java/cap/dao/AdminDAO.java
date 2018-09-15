package cap.dao;

import cap.model.Admin;

import java.util.List;

public interface AdminDAO {
    public Admin findAdmin(Admin admin);

    public Admin findAdmin(int id);
    List<Admin> findByPage(int pageNo, int pageSize);
    int getTotalCount();

    int update(int id, Admin admin);

    int delete(int id);

    int insert(Admin admin);
}
