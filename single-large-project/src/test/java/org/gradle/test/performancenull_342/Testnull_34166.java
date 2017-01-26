package org.gradle.test.performancenull_342;

import static org.junit.Assert.*;

public class Testnull_34166 {
    private final Productionnull_34166 production = new Productionnull_34166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}