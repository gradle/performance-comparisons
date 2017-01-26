package org.gradle.test.performancenull_40;

import static org.junit.Assert.*;

public class Testnull_3998 {
    private final Productionnull_3998 production = new Productionnull_3998("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}