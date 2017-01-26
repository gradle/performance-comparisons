package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_203 {
    private final Production89_203 production = new Production89_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}