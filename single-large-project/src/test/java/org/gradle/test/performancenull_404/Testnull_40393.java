package org.gradle.test.performancenull_404;

import static org.junit.Assert.*;

public class Testnull_40393 {
    private final Productionnull_40393 production = new Productionnull_40393("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}