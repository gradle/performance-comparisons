package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_384 {
    private final Production90_384 production = new Production90_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}