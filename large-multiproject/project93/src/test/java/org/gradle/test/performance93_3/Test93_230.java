package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_230 {
    private final Production93_230 production = new Production93_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}