package org.gradle.test.performancenull_50;

import static org.junit.Assert.*;

public class Testnull_4984 {
    private final Productionnull_4984 production = new Productionnull_4984("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}