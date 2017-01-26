package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_120 {
    private final Production90_120 production = new Production90_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}