package org.gradle.test.performancenull_40;

import static org.junit.Assert.*;

public class Testnull_3965 {
    private final Productionnull_3965 production = new Productionnull_3965("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}