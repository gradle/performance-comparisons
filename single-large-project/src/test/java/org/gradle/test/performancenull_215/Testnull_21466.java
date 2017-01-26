package org.gradle.test.performancenull_215;

import static org.junit.Assert.*;

public class Testnull_21466 {
    private final Productionnull_21466 production = new Productionnull_21466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}