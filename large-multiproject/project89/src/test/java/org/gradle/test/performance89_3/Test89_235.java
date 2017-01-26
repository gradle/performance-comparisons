package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_235 {
    private final Production89_235 production = new Production89_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}