package qlycuahangthuoc.DAO;

import qlycuahangthuoc.DTO.NhaCungCap;
import java.sql.*;
import java.util.Vector;
import javax.swing.JComboBox;
import qlycuahangthuoc.BUS.BUSPhieuNhap;
import qlycuahangthuoc.DTO.PhieuNhap;

public class DAOPhieuNhap {
    Connection con = KetNoiCSDL.getConnection();
    
    //-------------load ma NV------------------------
    public boolean loadcboxMaNV(JComboBox<String> comboBox) {
        Connection conn = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        
        try {
            conn = KetNoiCSDL.getConnection();
            stm = conn.prepareStatement("SELECT MaNV FROM NHANVIEN");
            rs = stm.executeQuery();
            
            comboBox.removeAllItems();
            
            while (rs.next()) {                
                String manv = rs.getString("MaNV");
                comboBox.addItem(manv);
            }
            
            return true;
        } catch (SQLException ex) {
            return false;
        } finally {
            KetNoiCSDL.Closeconnection(conn);
        }
    }
    
    
     //------------------load ma NCC-----------------------------
    public boolean loadcboxNCC(JComboBox<String> comboBox) {
        Connection conn = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        
        try {
            conn = KetNoiCSDL.getConnection();
            stm = conn.prepareStatement("""
                                        select MaNCC
                                        from NHACUNGCAP""");
            rs = stm.executeQuery();
            
            comboBox.removeAllItems();
            
            
            while (rs.next()) {                
                String makh = rs.getString("MaKH");
                comboBox.addItem(makh);
            }
            
            return true;
        } catch (SQLException ex) {
            return false;
        } finally {
            KetNoiCSDL.Closeconnection(conn);
        }
    }
    
    //---------------------------------------------------
    public Vector<PhieuNhap> getALLpn() {
        Vector<PhieuNhap> pnList = new Vector<>();
        try {
            String sql = "SELECT * FROM NHAPTHUOC";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String id = rs.getString("MaPhieuNhap");
                String idNV = rs.getString("MaNV");
                Date ngNhap = rs.getDate("NgayNhap");
                String idNCC = rs.getString("MaNCC");
                PhieuNhap pn = new PhieuNhap(id, idNV, ngNhap, idNCC);
                pnList.add (pn);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pnList;
    }

    public boolean addPN(PhieuNhap pn) {
        try {
            String sql = "INSERT INTO NHAPTHUOC (MaPhieuNhap, MaNV, NgayNhap, MaNCC) VALUES (?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, pn.getMaPhieuNhap());
            ps.setString(2, pn.getMaNV());
            ps.setDate(3, new java.sql.Date(pn.getNgayLap().getTime()));
            ps.setString(4, pn.getMaNCC());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public int hasPN(String id) {
        try {
            String sql = "SELECT * FROM NHAPTHUOC WHERE MaPhieuNhap = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return 1;
            } else {
                return 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }

    public int editPN(PhieuNhap pn){
        try {
            String sql = "UPDATE NHAPTHUOC SET MaNV = ?, NgayNhap = ?, MaNCC = ? WHERE MaPhieuNhap = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(4, pn.getMaPhieuNhap());
            ps.setString(3, pn.getMaNV());
            ps.setDate(2, new java.sql.Date(pn.getNgayLap().getTime()));
            ps.setString(1, pn.getMaNCC());
            int rowUpdate = ps.executeUpdate();
            if (rowUpdate > 0) {
                return 1;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int delPN(String id){
        try {
            String sql = "DELETE FROM NHAPTHUOC WHERE MaPhieuNhap = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, id);
            int rowDel = ps.executeUpdate();
            if (rowDel > 0) {
                return 1;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
    
    public NhaCungCap findPN (String id)
    {
        NhaCungCap ncc = null;
        try {
            String sql = "Select *from NHACUNGCAP where MaNCC = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next())
            {
                ncc = new NhaCungCap();
                ncc.setMaNCC(rs.getString("MaNCC"));
                ncc.setTenNCC(rs.getString("TenNCC"));
                ncc.setAddress(rs.getString("DiaChi"));
                ncc.setPhoneNumber(rs.getString("SDT"));
            }
            
        } catch (Exception e) {
        }
        return ncc;
    }
}
    
    
