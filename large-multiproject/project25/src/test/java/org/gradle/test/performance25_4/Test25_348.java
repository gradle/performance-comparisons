package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_348 {
    private final Production25_348 production = new Production25_348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}