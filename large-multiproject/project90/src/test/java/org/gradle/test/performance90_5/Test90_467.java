package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_467 {
    private final Production90_467 production = new Production90_467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}