package org.gradle.test.performancenull_95;

import static org.junit.Assert.*;

public class Testnull_9422 {
    private final Productionnull_9422 production = new Productionnull_9422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}