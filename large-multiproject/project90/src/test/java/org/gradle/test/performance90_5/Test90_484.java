package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_484 {
    private final Production90_484 production = new Production90_484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}