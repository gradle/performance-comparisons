package org.gradle.test.performancenull_422;

import static org.junit.Assert.*;

public class Testnull_42101 {
    private final Productionnull_42101 production = new Productionnull_42101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}