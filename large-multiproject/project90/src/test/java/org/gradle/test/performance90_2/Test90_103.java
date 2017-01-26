package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_103 {
    private final Production90_103 production = new Production90_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}