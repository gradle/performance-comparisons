package org.gradle.test.performance26_3;

import static org.junit.Assert.*;

public class Test26_230 {
    private final Production26_230 production = new Production26_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}