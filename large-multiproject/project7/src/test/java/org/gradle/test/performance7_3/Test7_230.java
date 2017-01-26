package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_230 {
    private final Production7_230 production = new Production7_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}