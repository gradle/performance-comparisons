package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_180 {
    private final Production90_180 production = new Production90_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}