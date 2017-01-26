package org.gradle.test.performancenull_402;

import static org.junit.Assert.*;

public class Testnull_40200 {
    private final Productionnull_40200 production = new Productionnull_40200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}