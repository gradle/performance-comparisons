package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_469 {
    private final Production90_469 production = new Production90_469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}