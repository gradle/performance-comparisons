package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_377 {
    private final Production89_377 production = new Production89_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}