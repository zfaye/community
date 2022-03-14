package com.newcode.community.community.entity;

/**
 * 分页相关信息
 */
public class Page {
    private  int current=1;
    //
    private int limit=10;
    //数据总数
    private int rows;
    //
    private String path;

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        if(current>=1){
            this.current = current;
        }
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        if(limit>=1 && limit<=100){
            this.limit = limit;
        }
    }

    public int getRows() {

        return rows;
    }

    public void setRows(int rows) {
        if(rows>=0){
            this.rows = rows;
        }
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * 获取当前页起始行
     */
    public int getOffset(){
        return (current-1)*limit;//current-1前一行
    }

    /**
     * 获取总页数
     * @return
     */
    public int getTotal(){
        if(rows%limit==0){
            return rows;
        }else{
            return  rows/limit+1;
        }
    }
    public int getFrom(){
      int from=current-2;
      return from<1?1:from;
    }
    public int getTo(){
        int to=current+2;
        int total=getTotal();
        return to>total?total:to;

    }

}
