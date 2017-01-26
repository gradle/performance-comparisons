package org.gradle.test.performancenull_419;

import static org.junit.Assert.*;

public class Testnull_41865 {
    private final Productionnull_41865 production = new Productionnull_41865("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}