package org.gradle.test.performancenull_102;

import static org.junit.Assert.*;

public class Testnull_10199 {
    private final Productionnull_10199 production = new Productionnull_10199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}