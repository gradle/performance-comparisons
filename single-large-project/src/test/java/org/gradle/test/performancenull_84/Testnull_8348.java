package org.gradle.test.performancenull_84;

import static org.junit.Assert.*;

public class Testnull_8348 {
    private final Productionnull_8348 production = new Productionnull_8348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}