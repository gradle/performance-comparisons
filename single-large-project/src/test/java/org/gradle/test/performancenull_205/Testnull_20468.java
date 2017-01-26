package org.gradle.test.performancenull_205;

import static org.junit.Assert.*;

public class Testnull_20468 {
    private final Productionnull_20468 production = new Productionnull_20468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}