package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_370 {
    private final Production89_370 production = new Production89_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}