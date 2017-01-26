package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_344 {
    private final Production90_344 production = new Production90_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}