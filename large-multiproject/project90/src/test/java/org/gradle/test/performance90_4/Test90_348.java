package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_348 {
    private final Production90_348 production = new Production90_348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}