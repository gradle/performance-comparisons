package org.gradle.test.performancenull_81;

import static org.junit.Assert.*;

public class Testnull_8081 {
    private final Productionnull_8081 production = new Productionnull_8081("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}