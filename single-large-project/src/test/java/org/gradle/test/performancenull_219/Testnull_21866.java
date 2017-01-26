package org.gradle.test.performancenull_219;

import static org.junit.Assert.*;

public class Testnull_21866 {
    private final Productionnull_21866 production = new Productionnull_21866("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}