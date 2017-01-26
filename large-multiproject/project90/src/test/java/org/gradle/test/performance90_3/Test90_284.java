package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_284 {
    private final Production90_284 production = new Production90_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}