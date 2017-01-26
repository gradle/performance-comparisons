package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_271 {
    private final Production90_271 production = new Production90_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}