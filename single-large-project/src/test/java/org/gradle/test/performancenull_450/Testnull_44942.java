package org.gradle.test.performancenull_450;

import static org.junit.Assert.*;

public class Testnull_44942 {
    private final Productionnull_44942 production = new Productionnull_44942("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}