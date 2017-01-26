package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_279 {
    private final Production90_279 production = new Production90_279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}