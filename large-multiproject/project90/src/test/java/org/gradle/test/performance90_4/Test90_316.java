package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_316 {
    private final Production90_316 production = new Production90_316("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}