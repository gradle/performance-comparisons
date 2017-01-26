package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_443 {
    private final Production89_443 production = new Production89_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}