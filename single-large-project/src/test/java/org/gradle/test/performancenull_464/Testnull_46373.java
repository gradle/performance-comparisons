package org.gradle.test.performancenull_464;

import static org.junit.Assert.*;

public class Testnull_46373 {
    private final Productionnull_46373 production = new Productionnull_46373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}