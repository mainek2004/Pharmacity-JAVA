package qlycuahangthuoc.DAO;

import qlycuahangthuoc.DTO.NhaCungCap;
import java.sql.*;
import java.util.Vector;

public class QlyNCC_Dao {
    Connection con = KetNoiCSDL.getConnection();

    public Vector<NhaCungCap> getALLncc() {
        Vector<NhaCungCap> nccList = new Vector<>();
        try {
            String sql = "SELECT * FROM NHACUNGCAP";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NhaCungCap nccDTO = new NhaCungCap();
                nccDTO.setMaNCC(rs.getString("MaNCC"));
                nccDTO.setTenNCC(rs.getString("TenNCC"));
                nccDTO.setAddress(rs.getString("DiaChi"));
                nccDTO.setPhoneNumber(rs.getString("SDT"));
                nccList.add(nccDTO);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return nccList;
    }

    public boolean addNCC(NhaCungCap ncc) {
        try {
            String sql = "INSERT INTO NHACUNGCAP (MaNCC, TenNCC, DiaChi, SDT) VALUES (?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, ncc.getMaNCC());
            ps.setString(2, ncc.getTenNCC());
            ps.setString(3, ncc.getAddress());
            ps.setString(4, ncc.getPhoneNumber());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public int hasMaNCC(String id) {
        try {
            String sql = "SELECT * FROM NHACUNGCAP WHERE MaNCC = ?";
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

    public int editNCC(NhaCungCap ncc) {
        try {
            String sql = "UPDATE NHACUNGCAP SET TenNCC = ?, DiaChi = ?, SDT = ? WHERE MaNCC = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, ncc.getTenNCC());
            ps.setString(2, ncc.getAddress());
            ps.setString(3, ncc.getPhoneNumber());
            ps.setString(4, ncc.getMaNCC());
            int rowUpdate = ps.executeUpdate();
            if (rowUpdate > 0) {
                return 1;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int delNCC(String idNCC) {
        try {
            String sql = "DELETE FROM NHACUNGCAP WHERE MaNCC = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, idNCC);
            int rowDel = ps.executeUpdate();
            if (rowDel > 0) {
                return 1;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
    
    public NhaCungCap findNCC (String id)
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

