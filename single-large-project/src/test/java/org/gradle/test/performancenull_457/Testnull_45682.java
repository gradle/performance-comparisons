package org.gradle.test.performancenull_457;

import static org.junit.Assert.*;

public class Testnull_45682 {
    private final Productionnull_45682 production = new Productionnull_45682("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}