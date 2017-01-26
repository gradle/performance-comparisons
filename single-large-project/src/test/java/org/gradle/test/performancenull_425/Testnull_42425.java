package org.gradle.test.performancenull_425;

import static org.junit.Assert.*;

public class Testnull_42425 {
    private final Productionnull_42425 production = new Productionnull_42425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}