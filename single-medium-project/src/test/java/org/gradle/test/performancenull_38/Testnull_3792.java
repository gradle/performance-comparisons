package org.gradle.test.performancenull_38;

import static org.junit.Assert.*;

public class Testnull_3792 {
    private final Productionnull_3792 production = new Productionnull_3792("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}