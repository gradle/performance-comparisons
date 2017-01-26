package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_223 {
    private final Production90_223 production = new Production90_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}