package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_384 {
    private final Production89_384 production = new Production89_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}