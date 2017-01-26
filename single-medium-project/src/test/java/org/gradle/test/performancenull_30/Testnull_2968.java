package org.gradle.test.performancenull_30;

import static org.junit.Assert.*;

public class Testnull_2968 {
    private final Productionnull_2968 production = new Productionnull_2968("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}