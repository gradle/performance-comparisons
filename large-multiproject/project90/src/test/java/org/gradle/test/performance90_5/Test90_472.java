package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_472 {
    private final Production90_472 production = new Production90_472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}