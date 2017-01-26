package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_141 {
    private final Production90_141 production = new Production90_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}