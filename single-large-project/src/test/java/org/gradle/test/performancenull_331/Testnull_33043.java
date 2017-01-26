package org.gradle.test.performancenull_331;

import static org.junit.Assert.*;

public class Testnull_33043 {
    private final Productionnull_33043 production = new Productionnull_33043("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}