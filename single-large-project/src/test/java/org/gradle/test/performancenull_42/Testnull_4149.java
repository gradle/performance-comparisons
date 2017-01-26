package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4149 {
    private final Productionnull_4149 production = new Productionnull_4149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}