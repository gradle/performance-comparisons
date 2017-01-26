package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_339 {
    private final Production90_339 production = new Production90_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}