package org.gradle.test.performancenull_404;

import static org.junit.Assert.*;

public class Testnull_40373 {
    private final Productionnull_40373 production = new Productionnull_40373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}