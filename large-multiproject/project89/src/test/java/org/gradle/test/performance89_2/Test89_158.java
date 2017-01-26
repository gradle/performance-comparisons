package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_158 {
    private final Production89_158 production = new Production89_158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}