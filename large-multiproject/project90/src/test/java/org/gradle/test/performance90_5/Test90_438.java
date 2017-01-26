package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_438 {
    private final Production90_438 production = new Production90_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}