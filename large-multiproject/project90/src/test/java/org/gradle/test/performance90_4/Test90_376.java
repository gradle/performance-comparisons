package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_376 {
    private final Production90_376 production = new Production90_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}