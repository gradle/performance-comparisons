package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34963 {
    private final Productionnull_34963 production = new Productionnull_34963("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}