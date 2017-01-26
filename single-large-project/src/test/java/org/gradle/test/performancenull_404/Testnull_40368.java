package org.gradle.test.performancenull_404;

import static org.junit.Assert.*;

public class Testnull_40368 {
    private final Productionnull_40368 production = new Productionnull_40368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}