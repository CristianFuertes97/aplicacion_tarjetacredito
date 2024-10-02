package com.aluracursos.tiendaalura.modelos;


public class Tarjeta{

    // Atributos
    private int limite;
    private int saldo;
    private int compras;
    private int saldoACtual;

	

    // Constructor

    public Tarjeta() {
    }

    public Tarjeta(int limite) {
        this.limite = limite;
        
    }

    // getters and setters

    public int getLimite() {
        return this.limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public int getSaldo() {
        return this.saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getCompras() {
        return this.compras;
    }

    public void setCompras(int compras) {
        this.compras = compras;
    }

    public int getSaldoACtual() {
		return this.saldoACtual;
	}

	public void setSaldoACtual(int saldoACtual) {
		this.saldoACtual = saldoACtual;
	}

    // Metodos
    public void comprar(Producto product){
        this.saldo += product.getPrecio();
        this.compras++;
    }

    public int valorActual(Producto product){
        return this.limite -= product.getPrecio();
    }

    public boolean lanzarCompra(Producto product){
        if(this.limite >= product.getPrecio()){
            this.limite -= product.getPrecio();
            return true;
        }
        return false;
        
    }

   
}
