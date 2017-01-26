package org.gradle.test.performancenull_345;

import static org.junit.Assert.*;

public class Testnull_34489 {
    private final Productionnull_34489 production = new Productionnull_34489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}