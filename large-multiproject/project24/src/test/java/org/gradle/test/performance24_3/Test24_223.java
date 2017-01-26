package org.gradle.test.performance24_3;

import static org.junit.Assert.*;

public class Test24_223 {
    private final Production24_223 production = new Production24_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}