package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_22 {
    private final Production90_22 production = new Production90_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}