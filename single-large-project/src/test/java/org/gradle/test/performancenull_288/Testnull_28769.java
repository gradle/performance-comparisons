package org.gradle.test.performancenull_288;

import static org.junit.Assert.*;

public class Testnull_28769 {
    private final Productionnull_28769 production = new Productionnull_28769("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}