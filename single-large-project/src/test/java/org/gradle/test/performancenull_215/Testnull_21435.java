package org.gradle.test.performancenull_215;

import static org.junit.Assert.*;

public class Testnull_21435 {
    private final Productionnull_21435 production = new Productionnull_21435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}