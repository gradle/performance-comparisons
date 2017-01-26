package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49974 {
    private final Productionnull_49974 production = new Productionnull_49974("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}