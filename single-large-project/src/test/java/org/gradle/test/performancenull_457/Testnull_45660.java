package org.gradle.test.performancenull_457;

import static org.junit.Assert.*;

public class Testnull_45660 {
    private final Productionnull_45660 production = new Productionnull_45660("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}