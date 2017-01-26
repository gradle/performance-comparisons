package org.gradle.test.performancenull_30;

import static org.junit.Assert.*;

public class Testnull_2903 {
    private final Productionnull_2903 production = new Productionnull_2903("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}