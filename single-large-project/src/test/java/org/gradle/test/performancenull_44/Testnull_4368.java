package org.gradle.test.performancenull_44;

import static org.junit.Assert.*;

public class Testnull_4368 {
    private final Productionnull_4368 production = new Productionnull_4368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}