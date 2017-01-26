package org.gradle.test.performancenull_217;

import static org.junit.Assert.*;

public class Testnull_21631 {
    private final Productionnull_21631 production = new Productionnull_21631("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}