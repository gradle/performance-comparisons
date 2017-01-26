package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_247 {
    private final Production89_247 production = new Production89_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}