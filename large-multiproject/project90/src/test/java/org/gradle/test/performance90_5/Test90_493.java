package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_493 {
    private final Production90_493 production = new Production90_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}