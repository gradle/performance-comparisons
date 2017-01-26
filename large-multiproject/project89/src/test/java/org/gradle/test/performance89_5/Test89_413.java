package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_413 {
    private final Production89_413 production = new Production89_413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}