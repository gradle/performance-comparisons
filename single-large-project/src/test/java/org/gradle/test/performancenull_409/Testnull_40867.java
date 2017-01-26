package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40867 {
    private final Productionnull_40867 production = new Productionnull_40867("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}