package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_321 {
    private final Production90_321 production = new Production90_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}