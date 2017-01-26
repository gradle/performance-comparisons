package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_436 {
    private final Production90_436 production = new Production90_436("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}