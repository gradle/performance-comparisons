package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10078 {
    private final Productionnull_10078 production = new Productionnull_10078("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}