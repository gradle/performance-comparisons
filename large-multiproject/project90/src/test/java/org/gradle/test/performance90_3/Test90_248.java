package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_248 {
    private final Production90_248 production = new Production90_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}