package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_396 {
    private final Production89_396 production = new Production89_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}