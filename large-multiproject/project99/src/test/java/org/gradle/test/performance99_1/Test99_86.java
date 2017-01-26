package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_86 {
    private final Production99_86 production = new Production99_86("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}