package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_348 {
    private final Production24_348 production = new Production24_348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}