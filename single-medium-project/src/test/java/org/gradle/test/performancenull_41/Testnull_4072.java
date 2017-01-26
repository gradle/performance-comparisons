package org.gradle.test.performancenull_41;

import static org.junit.Assert.*;

public class Testnull_4072 {
    private final Productionnull_4072 production = new Productionnull_4072("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}