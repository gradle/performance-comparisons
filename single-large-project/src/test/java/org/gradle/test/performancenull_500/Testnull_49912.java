package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49912 {
    private final Productionnull_49912 production = new Productionnull_49912("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}