package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_11 {
    private final Production99_11 production = new Production99_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}