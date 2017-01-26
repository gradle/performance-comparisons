package org.gradle.test.performancenull_215;

import static org.junit.Assert.*;

public class Testnull_21457 {
    private final Productionnull_21457 production = new Productionnull_21457("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}