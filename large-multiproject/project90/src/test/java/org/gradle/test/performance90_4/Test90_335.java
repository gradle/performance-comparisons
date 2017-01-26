package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_335 {
    private final Production90_335 production = new Production90_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}