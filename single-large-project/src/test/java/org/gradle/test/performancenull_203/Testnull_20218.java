package org.gradle.test.performancenull_203;

import static org.junit.Assert.*;

public class Testnull_20218 {
    private final Productionnull_20218 production = new Productionnull_20218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}