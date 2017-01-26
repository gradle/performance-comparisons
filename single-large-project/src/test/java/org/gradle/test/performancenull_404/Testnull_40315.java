package org.gradle.test.performancenull_404;

import static org.junit.Assert.*;

public class Testnull_40315 {
    private final Productionnull_40315 production = new Productionnull_40315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}