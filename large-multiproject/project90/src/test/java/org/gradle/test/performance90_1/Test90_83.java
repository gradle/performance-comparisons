package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_83 {
    private final Production90_83 production = new Production90_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}