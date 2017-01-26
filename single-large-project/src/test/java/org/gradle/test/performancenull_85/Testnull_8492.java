package org.gradle.test.performancenull_85;

import static org.junit.Assert.*;

public class Testnull_8492 {
    private final Productionnull_8492 production = new Productionnull_8492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}