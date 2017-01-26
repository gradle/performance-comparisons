package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34930 {
    private final Productionnull_34930 production = new Productionnull_34930("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}