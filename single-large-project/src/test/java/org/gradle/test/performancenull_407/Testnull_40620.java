package org.gradle.test.performancenull_407;

import static org.junit.Assert.*;

public class Testnull_40620 {
    private final Productionnull_40620 production = new Productionnull_40620("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}