package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_354 {
    private final Production90_354 production = new Production90_354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}