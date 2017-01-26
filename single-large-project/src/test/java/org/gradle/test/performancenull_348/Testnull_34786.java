package org.gradle.test.performancenull_348;

import static org.junit.Assert.*;

public class Testnull_34786 {
    private final Productionnull_34786 production = new Productionnull_34786("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}