package org.gradle.test.performancenull_282;

import static org.junit.Assert.*;

public class Testnull_28199 {
    private final Productionnull_28199 production = new Productionnull_28199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}