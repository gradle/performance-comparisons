package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_375 {
    private final Production24_375 production = new Production24_375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}