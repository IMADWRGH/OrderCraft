package com.example.ordercraft.GestionArticles;
import java.util.Date;
import java.util.List;

    public class Commande {

        private Client client;
        private List<Article> articles;
        private Date date;
        private String etat;

        public Commande() {
        }

        public Commande(Client client, List<Article> articles, Date date, String etat) {
            this.client = client;
            this.articles = articles;
            this.date = date;
            this.etat = etat;
        }


        public Client getClient() {
            return client;
        }

        public void setClient(Client client) {
            this.client = client;
        }

        public List<Article> getArticles() {
            return articles;
        }

        public void setArticles(List<Article> articles) {
            this.articles = articles;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getEtat() {
            return etat;
        }

        public void setEtat(String etat) {
            this.etat = etat;
        }

        @Override
        public String toString() {
            return "Commande{" +
                    "client=" + client +
                    ", articles=" + articles +
                    ", date=" + date +
                    ", etat='" + etat + '\'' +
                    '}';
        }
    }


