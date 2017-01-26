package org.gradle.test.performancenull_427;

import static org.junit.Assert.*;

public class Testnull_42686 {
    private final Productionnull_42686 production = new Productionnull_42686("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}