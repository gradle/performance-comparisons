package org.gradle.test.performancenull_457;

import static org.junit.Assert.*;

public class Testnull_45681 {
    private final Productionnull_45681 production = new Productionnull_45681("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}