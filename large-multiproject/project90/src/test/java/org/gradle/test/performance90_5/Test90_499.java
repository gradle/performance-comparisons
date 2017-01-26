package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_499 {
    private final Production90_499 production = new Production90_499("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}