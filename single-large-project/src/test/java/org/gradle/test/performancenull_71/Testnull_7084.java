package org.gradle.test.performancenull_71;

import static org.junit.Assert.*;

public class Testnull_7084 {
    private final Productionnull_7084 production = new Productionnull_7084("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}