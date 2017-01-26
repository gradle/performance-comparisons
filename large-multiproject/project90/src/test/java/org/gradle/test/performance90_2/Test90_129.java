package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_129 {
    private final Production90_129 production = new Production90_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}