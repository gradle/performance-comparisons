package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40885 {
    private final Productionnull_40885 production = new Productionnull_40885("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}