package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_13 {
    private final Production89_13 production = new Production89_13("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}