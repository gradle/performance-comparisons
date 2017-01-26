package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_328 {
    private final Production90_328 production = new Production90_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}