package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37428 {
    private final Productionnull_37428 production = new Productionnull_37428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}