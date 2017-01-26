package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_489 {
    private final Production90_489 production = new Production90_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}