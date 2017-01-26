package org.gradle.test.performancenull_348;

import static org.junit.Assert.*;

public class Testnull_34769 {
    private final Productionnull_34769 production = new Productionnull_34769("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}