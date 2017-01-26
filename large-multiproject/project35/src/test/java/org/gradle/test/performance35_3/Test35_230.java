package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_230 {
    private final Production35_230 production = new Production35_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}