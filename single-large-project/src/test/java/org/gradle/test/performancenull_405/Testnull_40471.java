package org.gradle.test.performancenull_405;

import static org.junit.Assert.*;

public class Testnull_40471 {
    private final Productionnull_40471 production = new Productionnull_40471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}