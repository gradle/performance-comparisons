package org.gradle.test.performancenull_458;

import static org.junit.Assert.*;

public class Testnull_45789 {
    private final Productionnull_45789 production = new Productionnull_45789("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}