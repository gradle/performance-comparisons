package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_370 {
    private final Production47_370 production = new Production47_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}