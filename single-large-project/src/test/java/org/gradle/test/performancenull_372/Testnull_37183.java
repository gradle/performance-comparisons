package org.gradle.test.performancenull_372;

import static org.junit.Assert.*;

public class Testnull_37183 {
    private final Productionnull_37183 production = new Productionnull_37183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}