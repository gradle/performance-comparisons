package org.gradle.test.performancenull_341;

import static org.junit.Assert.*;

public class Testnull_34078 {
    private final Productionnull_34078 production = new Productionnull_34078("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}