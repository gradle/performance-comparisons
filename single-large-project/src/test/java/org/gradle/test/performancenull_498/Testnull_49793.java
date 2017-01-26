package org.gradle.test.performancenull_498;

import static org.junit.Assert.*;

public class Testnull_49793 {
    private final Productionnull_49793 production = new Productionnull_49793("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}