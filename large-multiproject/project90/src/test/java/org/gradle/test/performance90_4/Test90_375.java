package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_375 {
    private final Production90_375 production = new Production90_375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}