package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40856 {
    private final Productionnull_40856 production = new Productionnull_40856("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}