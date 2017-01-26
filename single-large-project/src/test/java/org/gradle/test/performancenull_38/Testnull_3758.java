package org.gradle.test.performancenull_38;

import static org.junit.Assert.*;

public class Testnull_3758 {
    private final Productionnull_3758 production = new Productionnull_3758("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}