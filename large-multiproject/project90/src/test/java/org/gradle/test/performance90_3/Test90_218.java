package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_218 {
    private final Production90_218 production = new Production90_218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}