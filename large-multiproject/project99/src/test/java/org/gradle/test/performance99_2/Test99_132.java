package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_132 {
    private final Production99_132 production = new Production99_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}