package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_250 {
    private final Production90_250 production = new Production90_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}