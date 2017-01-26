package org.gradle.test.performancenull_40;

import static org.junit.Assert.*;

public class Testnull_3928 {
    private final Productionnull_3928 production = new Productionnull_3928("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}