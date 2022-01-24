package com.example.examenrepeticion;

public class Chocolates {

        private int idChocolate;
        private String nombreChocolate;
        private String DescripcionChocolate;
        private String Precio;

        public Chocolates(int idChocolate, String nombreChocolate, String descripcionChocolate, String precio) {
                this.idChocolate = idChocolate;
                this.nombreChocolate = nombreChocolate;
                DescripcionChocolate = descripcionChocolate;
                Precio = precio;
        }

        public int getIdChocolate() {
                return idChocolate;
        }

        public void setIdChocolate(int idChocolate) {
                this.idChocolate = idChocolate;
        }

        public String getNombreChocolate() {
                return nombreChocolate;
        }

        public void setNombreChocolate(String nombreChocolate) {
                this.nombreChocolate = nombreChocolate;
        }

        public String getDescripcionChocolate() {
                return DescripcionChocolate;
        }

        public void setDescripcionChocolate(String descripcionChocolate) {
                DescripcionChocolate = descripcionChocolate;
        }

        public String getPrecio() {
                return Precio;
        }

        public void setPrecio(String precio) {
                Precio = precio;
        }
}
