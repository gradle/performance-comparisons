package org.gradle.test.performancenull_404;

import static org.junit.Assert.*;

public class Testnull_40335 {
    private final Productionnull_40335 production = new Productionnull_40335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}