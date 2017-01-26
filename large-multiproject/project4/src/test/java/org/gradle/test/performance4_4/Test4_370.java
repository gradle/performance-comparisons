package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_370 {
    private final Production4_370 production = new Production4_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}