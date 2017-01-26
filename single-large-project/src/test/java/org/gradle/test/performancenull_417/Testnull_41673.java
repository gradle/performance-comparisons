package org.gradle.test.performancenull_417;

import static org.junit.Assert.*;

public class Testnull_41673 {
    private final Productionnull_41673 production = new Productionnull_41673("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}