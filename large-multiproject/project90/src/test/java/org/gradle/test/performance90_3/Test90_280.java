package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_280 {
    private final Production90_280 production = new Production90_280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}