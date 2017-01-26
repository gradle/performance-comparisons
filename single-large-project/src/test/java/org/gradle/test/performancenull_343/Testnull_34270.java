package org.gradle.test.performancenull_343;

import static org.junit.Assert.*;

public class Testnull_34270 {
    private final Productionnull_34270 production = new Productionnull_34270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}