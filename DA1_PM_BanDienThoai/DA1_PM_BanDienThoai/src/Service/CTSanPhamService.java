package Service;

import Repositories.CtSanPhamRepo;
import ViewModel.QLCTSanPham;
import java.util.ArrayList;
import Repositories.ICTSanPhamRepo;

public class CTSanPhamService implements ICTSanPhamService {

    private ICTSanPhamRepo ctspService;

    public CTSanPhamService() {
        ctspService = new CtSanPhamRepo();
    }

    @Override
    public ArrayList<QLCTSanPham> getList() {
       return ctspService.all();
    }

    
}
