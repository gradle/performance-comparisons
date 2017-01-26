package org.gradle.test.performancenull_300;

import static org.junit.Assert.*;

public class Testnull_29919 {
    private final Productionnull_29919 production = new Productionnull_29919("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}