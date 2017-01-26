package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_299 {
    private final Production90_299 production = new Production90_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}