package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_371 {
    private final Production89_371 production = new Production89_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}