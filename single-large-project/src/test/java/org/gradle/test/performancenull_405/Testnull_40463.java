package org.gradle.test.performancenull_405;

import static org.junit.Assert.*;

public class Testnull_40463 {
    private final Productionnull_40463 production = new Productionnull_40463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}