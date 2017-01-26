package org.gradle.test.performancenull_401;

import static org.junit.Assert.*;

public class Testnull_40041 {
    private final Productionnull_40041 production = new Productionnull_40041("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}