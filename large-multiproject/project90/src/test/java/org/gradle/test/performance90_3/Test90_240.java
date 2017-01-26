package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_240 {
    private final Production90_240 production = new Production90_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}