package org.gradle.test.performancenull_347;

import static org.junit.Assert.*;

public class Testnull_34683 {
    private final Productionnull_34683 production = new Productionnull_34683("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}