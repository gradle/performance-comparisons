package org.gradle.test.performancenull_404;

import static org.junit.Assert.*;

public class Testnull_40366 {
    private final Productionnull_40366 production = new Productionnull_40366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}