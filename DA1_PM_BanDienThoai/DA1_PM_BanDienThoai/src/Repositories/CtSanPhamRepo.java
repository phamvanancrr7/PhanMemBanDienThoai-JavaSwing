package Repositories;

import ViewModel.QLCTSanPham;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdbcutil.DBContext;

public class CtSanPhamRepo implements ICTSanPhamRepo{

    private Connection conn;

    public CtSanPhamRepo() {
        try {
            conn = DBContext.getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public ArrayList<QLCTSanPham>all() {
        ArrayList<QLCTSanPham> listSP = new ArrayList<>();
        String sql = " SELECT sanpham.ten_sp, loai.ten_loai,bonho.ram,bonho.rom,manhinh.kichthuoc,\n"
                + "  a.so_luong,a.gia_ban\n"
                + "  FROM sanphamchitiet a join sanpham on a.id_sp = sanpham.id\n"
                + "						join loai on a.id_loai = loai.id\n"
                + "						join bonho on a.id_bonho = bonho.id\n"
                + "						join manhinh on a.id_manhinh = manhinh.id\n";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                String tenSp = rs.getString("ten_sp");
                String loaiSp = rs.getString("ten_loai");
                String ramSp = rs.getString("ram");
                String romSP = rs.getString("rom");
                float manHinhSp = rs.getFloat("kichthuoc");
                int soLuongSp = rs.getInt("so_luong");
                long giaBanSP = rs.getLong("gia_ban");
                
                QLCTSanPham qlSp = new QLCTSanPham(tenSp, loaiSp, ramSp, romSP, manHinhSp, soLuongSp, giaBanSP);
                listSP.add(qlSp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listSP;
    }
    public static void main(String[] args) {
        CtSanPhamRepo bill = new CtSanPhamRepo();
        bill.all().forEach(s->System.out.println(s.toString()));
    }
}
