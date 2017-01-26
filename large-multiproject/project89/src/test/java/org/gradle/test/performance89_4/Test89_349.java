package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_349 {
    private final Production89_349 production = new Production89_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}