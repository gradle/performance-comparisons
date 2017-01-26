package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_181 {
    private final Production90_181 production = new Production90_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}