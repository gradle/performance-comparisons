package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_349 {
    private final Production90_349 production = new Production90_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}