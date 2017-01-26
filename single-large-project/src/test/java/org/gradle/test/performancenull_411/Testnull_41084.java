package org.gradle.test.performancenull_411;

import static org.junit.Assert.*;

public class Testnull_41084 {
    private final Productionnull_41084 production = new Productionnull_41084("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}