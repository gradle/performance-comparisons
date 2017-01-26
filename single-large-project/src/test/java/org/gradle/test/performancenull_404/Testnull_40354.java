package org.gradle.test.performancenull_404;

import static org.junit.Assert.*;

public class Testnull_40354 {
    private final Productionnull_40354 production = new Productionnull_40354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}