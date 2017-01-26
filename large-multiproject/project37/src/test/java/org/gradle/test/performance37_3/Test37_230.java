package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_230 {
    private final Production37_230 production = new Production37_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}