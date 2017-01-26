package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_312 {
    private final Production89_312 production = new Production89_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}