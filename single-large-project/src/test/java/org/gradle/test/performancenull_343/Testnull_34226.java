package org.gradle.test.performancenull_343;

import static org.junit.Assert.*;

public class Testnull_34226 {
    private final Productionnull_34226 production = new Productionnull_34226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}