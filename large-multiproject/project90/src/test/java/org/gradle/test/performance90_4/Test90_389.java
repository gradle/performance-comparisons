package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_389 {
    private final Production90_389 production = new Production90_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}