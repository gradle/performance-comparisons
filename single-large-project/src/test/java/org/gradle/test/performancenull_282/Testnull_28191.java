package org.gradle.test.performancenull_282;

import static org.junit.Assert.*;

public class Testnull_28191 {
    private final Productionnull_28191 production = new Productionnull_28191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}