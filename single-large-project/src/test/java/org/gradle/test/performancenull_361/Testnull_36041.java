package org.gradle.test.performancenull_361;

import static org.junit.Assert.*;

public class Testnull_36041 {
    private final Productionnull_36041 production = new Productionnull_36041("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}