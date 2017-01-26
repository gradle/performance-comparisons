package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_355 {
    private final Production89_355 production = new Production89_355("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}