package org.gradle.test.performancenull_271;

import static org.junit.Assert.*;

public class Testnull_27069 {
    private final Productionnull_27069 production = new Productionnull_27069("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}