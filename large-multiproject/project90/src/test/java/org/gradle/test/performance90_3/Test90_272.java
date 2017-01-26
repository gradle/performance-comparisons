package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_272 {
    private final Production90_272 production = new Production90_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}