package org.gradle.test.performancenull_81;

import static org.junit.Assert.*;

public class Testnull_8028 {
    private final Productionnull_8028 production = new Productionnull_8028("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}