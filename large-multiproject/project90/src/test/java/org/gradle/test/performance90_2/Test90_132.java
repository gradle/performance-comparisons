package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_132 {
    private final Production90_132 production = new Production90_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}