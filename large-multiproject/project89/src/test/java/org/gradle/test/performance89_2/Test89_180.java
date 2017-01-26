package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_180 {
    private final Production89_180 production = new Production89_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}