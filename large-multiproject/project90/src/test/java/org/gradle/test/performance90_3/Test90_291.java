package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_291 {
    private final Production90_291 production = new Production90_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}