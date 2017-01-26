package org.gradle.test.performancenull_417;

import static org.junit.Assert.*;

public class Testnull_41645 {
    private final Productionnull_41645 production = new Productionnull_41645("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}