package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_370 {
    private final Production90_370 production = new Production90_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}