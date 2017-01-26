package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_275 {
    private final Production89_275 production = new Production89_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}