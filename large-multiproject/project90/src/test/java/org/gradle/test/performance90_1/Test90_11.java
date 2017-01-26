package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_11 {
    private final Production90_11 production = new Production90_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}