package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_218 {
    private final Production89_218 production = new Production89_218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}