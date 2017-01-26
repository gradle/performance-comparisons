package org.gradle.test.performancenull_58;

import static org.junit.Assert.*;

public class Testnull_5769 {
    private final Productionnull_5769 production = new Productionnull_5769("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}