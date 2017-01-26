package org.gradle.test.performancenull_417;

import static org.junit.Assert.*;

public class Testnull_41672 {
    private final Productionnull_41672 production = new Productionnull_41672("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}