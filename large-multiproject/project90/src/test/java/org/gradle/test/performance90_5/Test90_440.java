package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_440 {
    private final Production90_440 production = new Production90_440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}