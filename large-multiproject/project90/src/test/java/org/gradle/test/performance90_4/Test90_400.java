package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_400 {
    private final Production90_400 production = new Production90_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}