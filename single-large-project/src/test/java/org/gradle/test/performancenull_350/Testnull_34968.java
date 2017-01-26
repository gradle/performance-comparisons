package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34968 {
    private final Productionnull_34968 production = new Productionnull_34968("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}