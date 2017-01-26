package org.gradle.test.performancenull_41;

import static org.junit.Assert.*;

public class Testnull_4041 {
    private final Productionnull_4041 production = new Productionnull_4041("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}