package org.gradle.test.performancenull_240;

import static org.junit.Assert.*;

public class Testnull_23953 {
    private final Productionnull_23953 production = new Productionnull_23953("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}