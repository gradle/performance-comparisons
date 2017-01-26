package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_463 {
    private final Production90_463 production = new Production90_463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}