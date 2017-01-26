package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_273 {
    private final Production90_273 production = new Production90_273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}