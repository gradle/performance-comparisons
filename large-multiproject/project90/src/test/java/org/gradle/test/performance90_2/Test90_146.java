package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_146 {
    private final Production90_146 production = new Production90_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}