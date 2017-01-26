package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40873 {
    private final Productionnull_40873 production = new Productionnull_40873("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}