package org.gradle.test.performancenull_345;

import static org.junit.Assert.*;

public class Testnull_34473 {
    private final Productionnull_34473 production = new Productionnull_34473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}