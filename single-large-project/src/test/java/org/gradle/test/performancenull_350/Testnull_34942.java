package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34942 {
    private final Productionnull_34942 production = new Productionnull_34942("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}