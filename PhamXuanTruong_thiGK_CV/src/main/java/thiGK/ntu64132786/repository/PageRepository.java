package thiGK.ntu64132786.repository;

import thiGK.ntu64132786.model.Page;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PageRepository {
    private final List<Page> pages = new ArrayList<>();

    public List<Page> getAllPages() {
        return pages;
    }

    public void addPage(Page page) {
    	pages.add(page);
    }

    public void updatePage(String id, Page updatedPage) {
        for (Page s : pages) {
            if (s.getId().equals(id)) {
                s.setPagename(updatedPage.getPagename());
                s.setParentPageID(updatedPage.getParentPageID());
                return;
            }
        }
    }

    public void deletePage(String id) {
        pages.removeIf(s -> s.getId().equals(id));
    }
}
