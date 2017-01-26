package org.gradle.test.performancenull_48;

import static org.junit.Assert.*;

public class Testnull_4715 {
    private final Productionnull_4715 production = new Productionnull_4715("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}