package org.gradle.test.performancenull_429;

import static org.junit.Assert.*;

public class Testnull_42843 {
    private final Productionnull_42843 production = new Productionnull_42843("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}