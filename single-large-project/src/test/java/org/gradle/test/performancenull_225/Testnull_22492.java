package org.gradle.test.performancenull_225;

import static org.junit.Assert.*;

public class Testnull_22492 {
    private final Productionnull_22492 production = new Productionnull_22492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}