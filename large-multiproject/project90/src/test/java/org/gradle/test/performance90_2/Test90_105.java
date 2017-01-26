package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_105 {
    private final Production90_105 production = new Production90_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}