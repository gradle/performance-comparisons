package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_339 {
    private final Production89_339 production = new Production89_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}