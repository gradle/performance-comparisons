package org.gradle.test.performancenull_150;

import static org.junit.Assert.*;

public class Testnull_14926 {
    private final Productionnull_14926 production = new Productionnull_14926("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}