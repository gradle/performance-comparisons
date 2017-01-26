package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_483 {
    private final Production99_483 production = new Production99_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}