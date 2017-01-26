package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_399 {
    private final Production99_399 production = new Production99_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}