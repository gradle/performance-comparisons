package org.gradle.test.performancenull_405;

import static org.junit.Assert.*;

public class Testnull_40402 {
    private final Productionnull_40402 production = new Productionnull_40402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}