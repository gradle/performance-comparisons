package org.gradle.test.performancenull_308;

import static org.junit.Assert.*;

public class Testnull_30781 {
    private final Productionnull_30781 production = new Productionnull_30781("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}