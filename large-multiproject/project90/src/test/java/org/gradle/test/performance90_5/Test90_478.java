package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_478 {
    private final Production90_478 production = new Production90_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}