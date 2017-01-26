package org.gradle.test.performancenull_431;

import static org.junit.Assert.*;

public class Testnull_43100 {
    private final Productionnull_43100 production = new Productionnull_43100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}