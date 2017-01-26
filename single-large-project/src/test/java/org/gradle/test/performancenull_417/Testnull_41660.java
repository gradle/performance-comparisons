package org.gradle.test.performancenull_417;

import static org.junit.Assert.*;

public class Testnull_41660 {
    private final Productionnull_41660 production = new Productionnull_41660("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}