package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_429 {
    private final Production90_429 production = new Production90_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}