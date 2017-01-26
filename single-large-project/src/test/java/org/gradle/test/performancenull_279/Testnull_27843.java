package org.gradle.test.performancenull_279;

import static org.junit.Assert.*;

public class Testnull_27843 {
    private final Productionnull_27843 production = new Productionnull_27843("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}