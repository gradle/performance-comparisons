package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_410 {
    private final Production90_410 production = new Production90_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}