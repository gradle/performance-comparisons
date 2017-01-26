package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_311 {
    private final Production89_311 production = new Production89_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}