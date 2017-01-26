package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_453 {
    private final Production90_453 production = new Production90_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}