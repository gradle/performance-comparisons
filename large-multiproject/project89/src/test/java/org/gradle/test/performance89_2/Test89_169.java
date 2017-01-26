package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_169 {
    private final Production89_169 production = new Production89_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}