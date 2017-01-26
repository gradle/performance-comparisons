package org.gradle.test.performancenull_183;

import static org.junit.Assert.*;

public class Testnull_18213 {
    private final Productionnull_18213 production = new Productionnull_18213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}