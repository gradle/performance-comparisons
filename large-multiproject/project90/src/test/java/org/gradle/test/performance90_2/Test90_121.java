package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_121 {
    private final Production90_121 production = new Production90_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}