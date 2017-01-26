package org.gradle.test.performancenull_411;

import static org.junit.Assert.*;

public class Testnull_41099 {
    private final Productionnull_41099 production = new Productionnull_41099("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}