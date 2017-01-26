package org.gradle.test.performancenull_404;

import static org.junit.Assert.*;

public class Testnull_40397 {
    private final Productionnull_40397 production = new Productionnull_40397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}