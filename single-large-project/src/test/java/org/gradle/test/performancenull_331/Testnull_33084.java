package org.gradle.test.performancenull_331;

import static org.junit.Assert.*;

public class Testnull_33084 {
    private final Productionnull_33084 production = new Productionnull_33084("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}