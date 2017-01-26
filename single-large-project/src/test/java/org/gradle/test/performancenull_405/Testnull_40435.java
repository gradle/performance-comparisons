package org.gradle.test.performancenull_405;

import static org.junit.Assert.*;

public class Testnull_40435 {
    private final Productionnull_40435 production = new Productionnull_40435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}