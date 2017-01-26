package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34903 {
    private final Productionnull_34903 production = new Productionnull_34903("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}