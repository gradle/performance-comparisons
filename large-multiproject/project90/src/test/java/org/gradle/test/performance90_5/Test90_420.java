package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_420 {
    private final Production90_420 production = new Production90_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}