package org.gradle.test.performancenull_205;

import static org.junit.Assert.*;

public class Testnull_20466 {
    private final Productionnull_20466 production = new Productionnull_20466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}