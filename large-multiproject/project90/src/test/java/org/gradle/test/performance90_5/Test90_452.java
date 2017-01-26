package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_452 {
    private final Production90_452 production = new Production90_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}