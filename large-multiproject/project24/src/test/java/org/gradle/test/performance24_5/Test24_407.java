package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_407 {
    private final Production24_407 production = new Production24_407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}