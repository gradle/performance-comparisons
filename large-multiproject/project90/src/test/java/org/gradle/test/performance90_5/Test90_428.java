package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_428 {
    private final Production90_428 production = new Production90_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}