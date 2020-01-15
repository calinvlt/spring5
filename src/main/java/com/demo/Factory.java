package com.demo;

public class Factory {

    void produce() {
        Document doc = new Document();
        Printer p = new Printer(doc);
    }

    class Printer {
        private DocumentInterface document;

        Printer(DocumentInterface document) {
            this.document = document;
        }

        void print() {
            System.out.println(document.getPage());
        }

    }

    class Document implements DocumentInterface{
        Document() {}

        public String getPage() {
            return null;
        }
    }

    interface DocumentInterface {
        String getPage();
    }
}
