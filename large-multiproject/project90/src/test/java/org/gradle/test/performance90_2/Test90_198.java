package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_198 {
    private final Production90_198 production = new Production90_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}