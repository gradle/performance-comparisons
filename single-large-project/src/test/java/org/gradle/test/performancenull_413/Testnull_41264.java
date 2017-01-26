package org.gradle.test.performancenull_413;

import static org.junit.Assert.*;

public class Testnull_41264 {
    private final Productionnull_41264 production = new Productionnull_41264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}