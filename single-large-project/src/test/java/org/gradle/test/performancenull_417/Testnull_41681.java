package org.gradle.test.performancenull_417;

import static org.junit.Assert.*;

public class Testnull_41681 {
    private final Productionnull_41681 production = new Productionnull_41681("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}