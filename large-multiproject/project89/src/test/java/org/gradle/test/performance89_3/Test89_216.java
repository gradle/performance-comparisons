package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_216 {
    private final Production89_216 production = new Production89_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}