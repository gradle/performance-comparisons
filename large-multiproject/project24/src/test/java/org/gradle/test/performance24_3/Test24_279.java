package org.gradle.test.performance24_3;

import static org.junit.Assert.*;

public class Test24_279 {
    private final Production24_279 production = new Production24_279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}