package org.gradle.test.performancenull_404;

import static org.junit.Assert.*;

public class Testnull_40318 {
    private final Productionnull_40318 production = new Productionnull_40318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}