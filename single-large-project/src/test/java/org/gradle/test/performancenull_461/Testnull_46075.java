package org.gradle.test.performancenull_461;

import static org.junit.Assert.*;

public class Testnull_46075 {
    private final Productionnull_46075 production = new Productionnull_46075("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}