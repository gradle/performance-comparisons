package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_370 {
    private final Production25_370 production = new Production25_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}