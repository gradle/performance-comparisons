package org.gradle.test.performancenull_203;

import static org.junit.Assert.*;

public class Testnull_20203 {
    private final Productionnull_20203 production = new Productionnull_20203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}