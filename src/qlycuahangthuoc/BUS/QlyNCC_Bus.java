package qlycuahangthuoc.BUS;

import java.util.ArrayList;

import qlycuahangthuoc.DAO. QlyNCC_Dao;
import qlycuahangthuoc.DTO.NhaCungCap;
import java.util.Vector;

public class QlyNCC_Bus{

	QlyNCC_Dao daoncc = new QlyNCC_Dao();
	
	public Vector<NhaCungCap> getListNCC()
	{
		return daoncc.getALLncc();
	}
	
	public String addNCC(NhaCungCap ncc)
	{
            if (daoncc.hasMaNCC(ncc.getMaNCC()) == 1)
            {
                return "Mã NCC đã tồn tại";
            }
            if (daoncc.addNCC(ncc))
            {
                return "Thêm NCC thành công";
            }
            return "Thêm NCC thất bại";
	}
	
	public String deleteNCC (String id) {
		if(daoncc.delNCC(id) == 1)
		{
			 return "Xóa Thành Công";
		}
		return "Xóa Thất Bại";
	}
	
	public String updateNCC(NhaCungCap ncc) {
	    if (daoncc.editNCC(ncc) == 1)
            {
                return "Cập nhật thành công";
            }
            return "Cập nhật thất bại";
	}
	
//	public ArrayList<NhaCungCap> findNCCByNameOrId(String searchKeyword)
//	{
//		
//			return daoncc.findNCCByNameOrId(searchKeyword);
//		
//	}
//	
//	public String getTenNCC(String maNCC)
//	{
//		return daoncc.getTenNCC(maNCC);
//	}

        public  NhaCungCap findbyID(String id)
        {
            return daoncc.findNCC(id);
        }
}
