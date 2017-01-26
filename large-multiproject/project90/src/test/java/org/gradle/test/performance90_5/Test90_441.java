package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_441 {
    private final Production90_441 production = new Production90_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}