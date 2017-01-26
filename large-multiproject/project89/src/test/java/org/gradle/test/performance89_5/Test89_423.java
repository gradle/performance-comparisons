package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_423 {
    private final Production89_423 production = new Production89_423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}