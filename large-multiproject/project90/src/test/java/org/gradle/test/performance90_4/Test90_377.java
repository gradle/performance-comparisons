package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_377 {
    private final Production90_377 production = new Production90_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}