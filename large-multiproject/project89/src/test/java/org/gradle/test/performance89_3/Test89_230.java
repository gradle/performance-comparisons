package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_230 {
    private final Production89_230 production = new Production89_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}