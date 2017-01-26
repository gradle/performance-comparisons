package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_124 {
    private final Production90_124 production = new Production90_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}