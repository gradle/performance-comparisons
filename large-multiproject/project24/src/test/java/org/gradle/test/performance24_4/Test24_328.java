package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_328 {
    private final Production24_328 production = new Production24_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}