package org.gradle.test.performancenull_91;

import static org.junit.Assert.*;

public class Testnull_9085 {
    private final Productionnull_9085 production = new Productionnull_9085("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}