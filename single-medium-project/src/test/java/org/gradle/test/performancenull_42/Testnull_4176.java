package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4176 {
    private final Productionnull_4176 production = new Productionnull_4176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}