package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34984 {
    private final Productionnull_34984 production = new Productionnull_34984("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}