package org.gradle.test.performancenull_402;

import static org.junit.Assert.*;

public class Testnull_40154 {
    private final Productionnull_40154 production = new Productionnull_40154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}