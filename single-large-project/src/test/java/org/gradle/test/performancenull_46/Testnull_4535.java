package org.gradle.test.performancenull_46;

import static org.junit.Assert.*;

public class Testnull_4535 {
    private final Productionnull_4535 production = new Productionnull_4535("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}