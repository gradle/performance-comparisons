package org.gradle.test.performancenull_259;

import static org.junit.Assert.*;

public class Testnull_25835 {
    private final Productionnull_25835 production = new Productionnull_25835("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}