package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_276 {
    private final Production90_276 production = new Production90_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}