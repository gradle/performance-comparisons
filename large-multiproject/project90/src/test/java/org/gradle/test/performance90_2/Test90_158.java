package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_158 {
    private final Production90_158 production = new Production90_158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}