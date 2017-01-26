package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4139 {
    private final Productionnull_4139 production = new Productionnull_4139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}