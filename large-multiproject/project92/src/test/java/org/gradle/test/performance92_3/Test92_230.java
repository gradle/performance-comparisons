package org.gradle.test.performance92_3;

import static org.junit.Assert.*;

public class Test92_230 {
    private final Production92_230 production = new Production92_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}