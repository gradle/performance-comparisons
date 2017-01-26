package org.gradle.test.performancenull_464;

import static org.junit.Assert.*;

public class Testnull_46368 {
    private final Productionnull_46368 production = new Productionnull_46368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}