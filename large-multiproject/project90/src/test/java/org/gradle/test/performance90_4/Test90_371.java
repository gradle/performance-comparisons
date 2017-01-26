package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_371 {
    private final Production90_371 production = new Production90_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}