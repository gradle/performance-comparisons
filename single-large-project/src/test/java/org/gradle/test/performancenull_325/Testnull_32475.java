package org.gradle.test.performancenull_325;

import static org.junit.Assert.*;

public class Testnull_32475 {
    private final Productionnull_32475 production = new Productionnull_32475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}