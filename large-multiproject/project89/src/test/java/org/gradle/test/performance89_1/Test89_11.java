package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_11 {
    private final Production89_11 production = new Production89_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}