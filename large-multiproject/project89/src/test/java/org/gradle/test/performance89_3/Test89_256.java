package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_256 {
    private final Production89_256 production = new Production89_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}