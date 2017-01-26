package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_230 {
    private final Production20_230 production = new Production20_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}