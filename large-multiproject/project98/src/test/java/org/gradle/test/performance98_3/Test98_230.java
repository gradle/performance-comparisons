package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_230 {
    private final Production98_230 production = new Production98_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}