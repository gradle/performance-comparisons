package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_455 {
    private final Production90_455 production = new Production90_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}