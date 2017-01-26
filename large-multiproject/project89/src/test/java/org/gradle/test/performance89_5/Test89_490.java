package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_490 {
    private final Production89_490 production = new Production89_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}