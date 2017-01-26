package org.gradle.test.performancenull_51;

import static org.junit.Assert.*;

public class Testnull_5081 {
    private final Productionnull_5081 production = new Productionnull_5081("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}