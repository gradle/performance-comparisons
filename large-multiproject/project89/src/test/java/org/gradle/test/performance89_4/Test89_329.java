package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_329 {
    private final Production89_329 production = new Production89_329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}