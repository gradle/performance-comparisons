package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_455 {
    private final Production89_455 production = new Production89_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}