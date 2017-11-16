package com.neusoft.action;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.RequestAware;

import com.nesoft.service.ManageService;
import com.neusoft.model.Goods;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class UploadAction extends ActionSupport implements ModelDriven<Goods>,Preparable,RequestAware{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private Map<String, Object> request;
    private ManageService manageService;
    private Goods goods;
    private  File upImg;
    private String upImgContentType;
    private String upImgFileName;
    public void setUpImg(File upImg) {
		this.upImg = upImg;
	}
    public void setUpImgContentType(String upImgContentType) {
		this.upImgContentType = upImgContentType;
	}
    public void setUpImgFileName(String upImgFileName) {
		this.upImgFileName = upImgFileName;
	}
    public File getUpImg() {
		return upImg;
	}
    public String getUpImgContentType() {
		return upImgContentType;
	}
    public String getUpImgFileName() {
		return upImgFileName;
	}
    public void setManageService(ManageService manageService) {
		this.manageService = manageService;
	}
    public void prepareUploadImg(){
    	 goods = new Goods();
    }
    public String  uploadImg(){
    	
    	 String path= ServletActionContext.getServletContext().getRealPath("/images");
    	 /* path = path+"/images/";*/
    	/* path = path+"/abc";*/
    	  System.out.println(path);
    	 if(upImg != null){
    		File file2 = new File(new File(path),goods.getUpImgFileName());
    		System.out.println(file2);
    		System.out.println(file2.getParentFile());
    		if(!file2.getParentFile().exists()){
    			file2.getParentFile().mkdirs();
                  try {
    				
					    FileUtils.copyFile(upImg, file2);
				   } catch (IOException e) {
					   // TODO Auto-generated catch block
					   ServletActionContext.getContext().put("message", "图片上传失败！");
					  e.printStackTrace();
				   }
    			  ServletActionContext.getContext().put("message", "图片上传成功！");              
    		}
    		else{
    			
    			try {
    				
					FileUtils.copyFile(upImg, file2);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					 ServletActionContext.getContext().put("message", "图片上传失败！");
					e.printStackTrace();
				}
    			ServletActionContext.getContext().put("message", "图片上传成功");
    		}
    	 }
    	String result = manageService.select(goods);
		return result;
	  
    	
    }
	@Override
	public void setRequest(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		this.request=arg0;
	}

	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Goods getModel() {
		// TODO Auto-generated method stub
		return goods;
	}
	

}
