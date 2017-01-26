package org.gradle.test.performancenull_425;

import static org.junit.Assert.*;

public class Testnull_42467 {
    private final Productionnull_42467 production = new Productionnull_42467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}