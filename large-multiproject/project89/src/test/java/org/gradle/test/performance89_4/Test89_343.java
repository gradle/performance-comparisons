package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_343 {
    private final Production89_343 production = new Production89_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}