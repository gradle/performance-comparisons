package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_342 {
    private final Production90_342 production = new Production90_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}