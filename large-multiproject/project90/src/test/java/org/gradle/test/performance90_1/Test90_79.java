package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_79 {
    private final Production90_79 production = new Production90_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}