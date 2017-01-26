package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_291 {
    private final Production89_291 production = new Production89_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}