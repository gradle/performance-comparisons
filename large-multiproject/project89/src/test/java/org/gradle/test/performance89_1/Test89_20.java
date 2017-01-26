package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_20 {
    private final Production89_20 production = new Production89_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}