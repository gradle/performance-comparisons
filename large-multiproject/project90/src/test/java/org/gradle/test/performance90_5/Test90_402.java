package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_402 {
    private final Production90_402 production = new Production90_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}