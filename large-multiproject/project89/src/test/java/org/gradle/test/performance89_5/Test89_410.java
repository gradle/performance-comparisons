package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_410 {
    private final Production89_410 production = new Production89_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}