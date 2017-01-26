package org.gradle.test.performancenull_271;

import static org.junit.Assert.*;

public class Testnull_27008 {
    private final Productionnull_27008 production = new Productionnull_27008("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}