package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_150 {
    private final Production90_150 production = new Production90_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}