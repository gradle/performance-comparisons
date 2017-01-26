package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_284 {
    private final Production89_284 production = new Production89_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}