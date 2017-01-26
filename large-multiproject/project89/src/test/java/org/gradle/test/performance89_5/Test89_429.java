package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_429 {
    private final Production89_429 production = new Production89_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}