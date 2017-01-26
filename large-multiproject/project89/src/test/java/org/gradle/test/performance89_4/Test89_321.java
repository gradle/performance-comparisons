package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_321 {
    private final Production89_321 production = new Production89_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}