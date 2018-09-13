package cap.util;

import java.util.List;

public class PageBean {
    private List list;
    private int pageNo;
    private int pageSize;
    private int totalRecords;

    public int getTotalPages() {
        return totalRecords % pageSize == 0 ? totalRecords / pageSize : totalRecords / pageSize + 1;

    }

    public int getTopPageNo() {
        return 1;
    }

    public int getPreviousPageNo() {
        if (pageNo <= 1)
            return 1;
        return pageNo - 1;
    }

    public int getNextPageNo() {
        if (pageNo >= getTotalPages())
            return getTotalPages();
        return pageNo + 1;
    }

    public int getBottomPageNo() {
        return getTotalPages();
    }


    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(int totalRecords) {
        this.totalRecords = totalRecords;
    }
}
