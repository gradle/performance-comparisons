package org.gradle.test.performancenull_121;

import static org.junit.Assert.*;

public class Testnull_12031 {
    private final Productionnull_12031 production = new Productionnull_12031("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}