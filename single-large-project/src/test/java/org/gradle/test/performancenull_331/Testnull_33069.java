package org.gradle.test.performancenull_331;

import static org.junit.Assert.*;

public class Testnull_33069 {
    private final Productionnull_33069 production = new Productionnull_33069("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}