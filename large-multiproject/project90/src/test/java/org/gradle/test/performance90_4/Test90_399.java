package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_399 {
    private final Production90_399 production = new Production90_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}