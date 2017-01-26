package org.gradle.test.performancenull_300;

import static org.junit.Assert.*;

public class Testnull_29981 {
    private final Productionnull_29981 production = new Productionnull_29981("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}