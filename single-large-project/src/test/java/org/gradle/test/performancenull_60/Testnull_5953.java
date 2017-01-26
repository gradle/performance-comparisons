package org.gradle.test.performancenull_60;

import static org.junit.Assert.*;

public class Testnull_5953 {
    private final Productionnull_5953 production = new Productionnull_5953("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}