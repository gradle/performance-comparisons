package org.gradle.test.performancenull_282;

import static org.junit.Assert.*;

public class Testnull_28103 {
    private final Productionnull_28103 production = new Productionnull_28103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}