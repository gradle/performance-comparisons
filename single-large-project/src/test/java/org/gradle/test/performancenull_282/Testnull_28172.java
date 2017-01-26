package org.gradle.test.performancenull_282;

import static org.junit.Assert.*;

public class Testnull_28172 {
    private final Productionnull_28172 production = new Productionnull_28172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}