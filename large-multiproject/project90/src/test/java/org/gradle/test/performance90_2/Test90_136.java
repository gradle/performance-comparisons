package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_136 {
    private final Production90_136 production = new Production90_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}