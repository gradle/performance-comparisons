package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_231 {
    private final Production89_231 production = new Production89_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}