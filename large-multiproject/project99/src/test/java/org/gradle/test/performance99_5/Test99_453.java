package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_453 {
    private final Production99_453 production = new Production99_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}