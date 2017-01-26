package org.gradle.test.performancenull_404;

import static org.junit.Assert.*;

public class Testnull_40382 {
    private final Productionnull_40382 production = new Productionnull_40382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}