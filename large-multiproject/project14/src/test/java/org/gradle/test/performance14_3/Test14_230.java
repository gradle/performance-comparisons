package org.gradle.test.performance14_3;

import static org.junit.Assert.*;

public class Test14_230 {
    private final Production14_230 production = new Production14_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}