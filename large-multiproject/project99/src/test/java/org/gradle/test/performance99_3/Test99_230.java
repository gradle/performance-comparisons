package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_230 {
    private final Production99_230 production = new Production99_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}