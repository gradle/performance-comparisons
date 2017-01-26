package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_440 {
    private final Production89_440 production = new Production89_440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}