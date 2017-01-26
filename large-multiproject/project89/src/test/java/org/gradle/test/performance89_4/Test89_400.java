package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_400 {
    private final Production89_400 production = new Production89_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}