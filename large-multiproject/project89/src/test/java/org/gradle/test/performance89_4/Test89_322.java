package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_322 {
    private final Production89_322 production = new Production89_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}