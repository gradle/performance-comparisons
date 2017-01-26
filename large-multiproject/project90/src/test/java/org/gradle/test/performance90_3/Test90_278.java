package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_278 {
    private final Production90_278 production = new Production90_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}