package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_286 {
    private final Production89_286 production = new Production89_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}