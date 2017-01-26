package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_235 {
    private final Production90_235 production = new Production90_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}