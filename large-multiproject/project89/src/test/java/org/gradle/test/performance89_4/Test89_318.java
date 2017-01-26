package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_318 {
    private final Production89_318 production = new Production89_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}