package org.gradle.test.performancenull_281;

import static org.junit.Assert.*;

public class Testnull_28024 {
    private final Productionnull_28024 production = new Productionnull_28024("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}