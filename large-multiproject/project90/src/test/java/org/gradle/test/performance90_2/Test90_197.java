package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_197 {
    private final Production90_197 production = new Production90_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}