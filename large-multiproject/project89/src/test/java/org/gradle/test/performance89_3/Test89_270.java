package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_270 {
    private final Production89_270 production = new Production89_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}