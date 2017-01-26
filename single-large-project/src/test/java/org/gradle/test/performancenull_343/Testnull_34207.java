package org.gradle.test.performancenull_343;

import static org.junit.Assert.*;

public class Testnull_34207 {
    private final Productionnull_34207 production = new Productionnull_34207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}