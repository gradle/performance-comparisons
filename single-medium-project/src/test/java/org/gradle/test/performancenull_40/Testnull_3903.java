package org.gradle.test.performancenull_40;

import static org.junit.Assert.*;

public class Testnull_3903 {
    private final Productionnull_3903 production = new Productionnull_3903("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}