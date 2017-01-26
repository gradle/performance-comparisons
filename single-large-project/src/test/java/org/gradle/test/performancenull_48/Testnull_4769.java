package org.gradle.test.performancenull_48;

import static org.junit.Assert.*;

public class Testnull_4769 {
    private final Productionnull_4769 production = new Productionnull_4769("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}