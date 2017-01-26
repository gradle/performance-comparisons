package org.gradle.test.performancenull_63;

import static org.junit.Assert.*;

public class Testnull_6251 {
    private final Productionnull_6251 production = new Productionnull_6251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}