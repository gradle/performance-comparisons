package org.gradle.test.performancenull_183;

import static org.junit.Assert.*;

public class Testnull_18264 {
    private final Productionnull_18264 production = new Productionnull_18264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}