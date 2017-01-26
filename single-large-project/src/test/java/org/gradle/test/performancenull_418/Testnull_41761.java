package org.gradle.test.performancenull_418;

import static org.junit.Assert.*;

public class Testnull_41761 {
    private final Productionnull_41761 production = new Productionnull_41761("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}