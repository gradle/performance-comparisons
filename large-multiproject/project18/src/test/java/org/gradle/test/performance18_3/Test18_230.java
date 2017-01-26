package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_230 {
    private final Production18_230 production = new Production18_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}