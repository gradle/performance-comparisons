package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_470 {
    private final Production90_470 production = new Production90_470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}