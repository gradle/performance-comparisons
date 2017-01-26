package org.gradle.test.performance26_1;

import static org.junit.Assert.*;

public class Test26_86 {
    private final Production26_86 production = new Production26_86("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}