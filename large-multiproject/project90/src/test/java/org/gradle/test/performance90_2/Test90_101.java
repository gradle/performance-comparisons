package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_101 {
    private final Production90_101 production = new Production90_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}