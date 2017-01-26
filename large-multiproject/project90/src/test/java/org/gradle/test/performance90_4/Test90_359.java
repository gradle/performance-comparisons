package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_359 {
    private final Production90_359 production = new Production90_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}