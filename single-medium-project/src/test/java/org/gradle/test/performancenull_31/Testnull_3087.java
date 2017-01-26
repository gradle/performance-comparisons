package org.gradle.test.performancenull_31;

import static org.junit.Assert.*;

public class Testnull_3087 {
    private final Productionnull_3087 production = new Productionnull_3087("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}