package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_215 {
    private final Production89_215 production = new Production89_215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}