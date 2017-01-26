package org.gradle.test.performance63_3;

import static org.junit.Assert.*;

public class Test63_230 {
    private final Production63_230 production = new Production63_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}