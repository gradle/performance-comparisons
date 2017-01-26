package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_402 {
    private final Production89_402 production = new Production89_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}