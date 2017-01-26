package org.gradle.test.performancenull_371;

import static org.junit.Assert.*;

public class Testnull_37078 {
    private final Productionnull_37078 production = new Productionnull_37078("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}