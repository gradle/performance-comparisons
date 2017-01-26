package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_232 {
    private final Production90_232 production = new Production90_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}