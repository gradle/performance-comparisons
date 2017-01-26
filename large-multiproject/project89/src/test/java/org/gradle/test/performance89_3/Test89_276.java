package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_276 {
    private final Production89_276 production = new Production89_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}