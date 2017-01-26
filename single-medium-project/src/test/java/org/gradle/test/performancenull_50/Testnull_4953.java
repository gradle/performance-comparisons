package org.gradle.test.performancenull_50;

import static org.junit.Assert.*;

public class Testnull_4953 {
    private final Productionnull_4953 production = new Productionnull_4953("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}