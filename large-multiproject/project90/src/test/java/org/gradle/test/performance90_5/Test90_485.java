package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_485 {
    private final Production90_485 production = new Production90_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}