package org.gradle.test.performancenull_38;

import static org.junit.Assert.*;

public class Testnull_3703 {
    private final Productionnull_3703 production = new Productionnull_3703("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}