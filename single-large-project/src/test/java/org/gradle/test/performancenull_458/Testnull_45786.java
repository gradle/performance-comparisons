package org.gradle.test.performancenull_458;

import static org.junit.Assert.*;

public class Testnull_45786 {
    private final Productionnull_45786 production = new Productionnull_45786("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}