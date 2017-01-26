package org.gradle.test.performancenull_341;

import static org.junit.Assert.*;

public class Testnull_34081 {
    private final Productionnull_34081 production = new Productionnull_34081("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}