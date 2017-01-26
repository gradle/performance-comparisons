package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_287 {
    private final Production90_287 production = new Production90_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}