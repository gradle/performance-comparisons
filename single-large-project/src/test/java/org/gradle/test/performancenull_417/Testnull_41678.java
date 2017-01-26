package org.gradle.test.performancenull_417;

import static org.junit.Assert.*;

public class Testnull_41678 {
    private final Productionnull_41678 production = new Productionnull_41678("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}