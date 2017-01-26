package org.gradle.test.performancenull_340;

import static org.junit.Assert.*;

public class Testnull_33902 {
    private final Productionnull_33902 production = new Productionnull_33902("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}