package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_184 {
    private final Production90_184 production = new Production90_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}