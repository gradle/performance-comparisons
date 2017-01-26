package org.gradle.test.performancenull_404;

import static org.junit.Assert.*;

public class Testnull_40384 {
    private final Productionnull_40384 production = new Productionnull_40384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}