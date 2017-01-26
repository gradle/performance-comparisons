package org.gradle.test.performancenull_404;

import static org.junit.Assert.*;

public class Testnull_40364 {
    private final Productionnull_40364 production = new Productionnull_40364("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}