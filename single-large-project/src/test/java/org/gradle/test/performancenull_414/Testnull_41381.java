package org.gradle.test.performancenull_414;

import static org.junit.Assert.*;

public class Testnull_41381 {
    private final Productionnull_41381 production = new Productionnull_41381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}