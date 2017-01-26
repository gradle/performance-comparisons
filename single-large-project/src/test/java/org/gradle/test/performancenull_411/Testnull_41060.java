package org.gradle.test.performancenull_411;

import static org.junit.Assert.*;

public class Testnull_41060 {
    private final Productionnull_41060 production = new Productionnull_41060("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}