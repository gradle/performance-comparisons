package org.gradle.test.performancenull_370;

import static org.junit.Assert.*;

public class Testnull_36965 {
    private final Productionnull_36965 production = new Productionnull_36965("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}