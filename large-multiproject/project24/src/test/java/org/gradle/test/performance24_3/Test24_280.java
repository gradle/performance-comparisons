package org.gradle.test.performance24_3;

import static org.junit.Assert.*;

public class Test24_280 {
    private final Production24_280 production = new Production24_280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}