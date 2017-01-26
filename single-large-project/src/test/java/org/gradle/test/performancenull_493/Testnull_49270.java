package org.gradle.test.performancenull_493;

import static org.junit.Assert.*;

public class Testnull_49270 {
    private final Productionnull_49270 production = new Productionnull_49270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}