package org.gradle.test.performancenull_207;

import static org.junit.Assert.*;

public class Testnull_20686 {
    private final Productionnull_20686 production = new Productionnull_20686("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}