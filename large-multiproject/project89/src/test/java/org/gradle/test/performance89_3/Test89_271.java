package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_271 {
    private final Production89_271 production = new Production89_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}