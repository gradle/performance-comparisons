package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_368 {
    private final Production90_368 production = new Production90_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}