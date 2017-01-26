package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_57 {
    private final Production89_57 production = new Production89_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}