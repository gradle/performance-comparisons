package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_376 {
    private final Production99_376 production = new Production99_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}