package org.gradle.test.performancenull_325;

import static org.junit.Assert.*;

public class Testnull_32465 {
    private final Productionnull_32465 production = new Productionnull_32465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}