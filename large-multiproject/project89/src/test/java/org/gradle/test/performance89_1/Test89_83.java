package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_83 {
    private final Production89_83 production = new Production89_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}