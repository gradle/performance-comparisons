package org.gradle.test.performancenull_489;

import static org.junit.Assert.*;

public class Testnull_48842 {
    private final Productionnull_48842 production = new Productionnull_48842("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}