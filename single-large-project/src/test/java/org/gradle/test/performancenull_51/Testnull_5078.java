package org.gradle.test.performancenull_51;

import static org.junit.Assert.*;

public class Testnull_5078 {
    private final Productionnull_5078 production = new Productionnull_5078("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}