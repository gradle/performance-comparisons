package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_169 {
    private final Production90_169 production = new Production90_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}