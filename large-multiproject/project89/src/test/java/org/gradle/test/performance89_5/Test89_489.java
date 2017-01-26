package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_489 {
    private final Production89_489 production = new Production89_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}