package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_121 {
    private final Production99_121 production = new Production99_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}