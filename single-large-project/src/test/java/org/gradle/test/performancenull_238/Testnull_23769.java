package org.gradle.test.performancenull_238;

import static org.junit.Assert.*;

public class Testnull_23769 {
    private final Productionnull_23769 production = new Productionnull_23769("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}