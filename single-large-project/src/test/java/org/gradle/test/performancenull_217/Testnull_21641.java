package org.gradle.test.performancenull_217;

import static org.junit.Assert.*;

public class Testnull_21641 {
    private final Productionnull_21641 production = new Productionnull_21641("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}