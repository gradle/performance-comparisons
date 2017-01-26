package org.gradle.test.performancenull_427;

import static org.junit.Assert.*;

public class Testnull_42681 {
    private final Productionnull_42681 production = new Productionnull_42681("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}