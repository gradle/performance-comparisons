package org.gradle.test.performancenull_405;

import static org.junit.Assert.*;

public class Testnull_40465 {
    private final Productionnull_40465 production = new Productionnull_40465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}