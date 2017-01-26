package org.gradle.test.performancenull_484;

import static org.junit.Assert.*;

public class Testnull_48378 {
    private final Productionnull_48378 production = new Productionnull_48378("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}