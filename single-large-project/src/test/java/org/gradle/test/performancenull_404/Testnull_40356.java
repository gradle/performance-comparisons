package org.gradle.test.performancenull_404;

import static org.junit.Assert.*;

public class Testnull_40356 {
    private final Productionnull_40356 production = new Productionnull_40356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}