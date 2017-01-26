package org.gradle.test.performancenull_414;

import static org.junit.Assert.*;

public class Testnull_41373 {
    private final Productionnull_41373 production = new Productionnull_41373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}