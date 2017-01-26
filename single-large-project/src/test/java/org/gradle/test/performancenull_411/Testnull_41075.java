package org.gradle.test.performancenull_411;

import static org.junit.Assert.*;

public class Testnull_41075 {
    private final Productionnull_41075 production = new Productionnull_41075("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}