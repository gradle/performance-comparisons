package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_414 {
    private final Production24_414 production = new Production24_414("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}