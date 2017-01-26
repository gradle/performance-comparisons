package org.gradle.test.performancenull_412;

import static org.junit.Assert.*;

public class Testnull_41200 {
    private final Productionnull_41200 production = new Productionnull_41200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}