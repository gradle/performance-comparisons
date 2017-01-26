package org.gradle.test.performancenull_473;

import static org.junit.Assert.*;

public class Testnull_47264 {
    private final Productionnull_47264 production = new Productionnull_47264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}