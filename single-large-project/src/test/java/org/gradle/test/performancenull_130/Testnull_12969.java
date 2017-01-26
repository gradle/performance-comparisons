package org.gradle.test.performancenull_130;

import static org.junit.Assert.*;

public class Testnull_12969 {
    private final Productionnull_12969 production = new Productionnull_12969("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}