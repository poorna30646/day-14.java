class swiggy{
    protected String itemname;
    protected double itemprice;
    protected double totalBill;
    public swiggy(){
        totalBill=0.0;
    }
    public void additem(String itemname,double itemprice){
        this.itemname=itemname;
        this.itemprice=itemprice;
        totalBill+=itemprice;

    }
    public double gettotalbill(){
        return totalBill;
    }
}
class food extends swiggy{
    public food(){
        super();
    }
    public void addbiryani(){
        additem("biryani",200);
    }
    public void addrice(){
        additem("rice",150);
    }
    public void addchicken(){
        additem("chicken",180);
    }
    public void addidli(){
        additem("idli",50);
    }
    public void adddosa(){
        additem("dosa",100);
    }
    public void addkfc(){
        additem("kfc",500);

    }
    public void addcurdrice(){
        additem("curdrice()",100);
    }
}
class cooldrinks extends swiggy{
    public cooldrinks(){
        super();
    }
    public void addcocacola() {
        additem("cocacola",45);
    }
    public void addtumsup() {
        additem("tumsup",50);
    }
    public void addsting(){
        additem("sting",25);
    }
    public void addpulpyorange(){
        additem("pulpyorange",30);
    }

}
class fire
{
    public static void main(String args[])
    {
        food f=new food();
        cooldrinks c=new cooldrinks();
        f.addbiryani();
        f.addrice();
        c.addsting();
        System.out.println("bill for food:"+f.gettotalbill());
        System.out.println("bill for cooldrinks:"+c.gettotalbill());
        System.out.println("total bill:"+(f.gettotalbill() + c.gettotalbill()));
    }
}