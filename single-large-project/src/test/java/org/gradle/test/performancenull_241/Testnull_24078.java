package org.gradle.test.performancenull_241;

import static org.junit.Assert.*;

public class Testnull_24078 {
    private final Productionnull_24078 production = new Productionnull_24078("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}