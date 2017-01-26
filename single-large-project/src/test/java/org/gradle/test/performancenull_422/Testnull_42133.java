package org.gradle.test.performancenull_422;

import static org.junit.Assert.*;

public class Testnull_42133 {
    private final Productionnull_42133 production = new Productionnull_42133("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}