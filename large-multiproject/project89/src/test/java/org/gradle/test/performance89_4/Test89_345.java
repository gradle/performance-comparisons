package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_345 {
    private final Production89_345 production = new Production89_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}