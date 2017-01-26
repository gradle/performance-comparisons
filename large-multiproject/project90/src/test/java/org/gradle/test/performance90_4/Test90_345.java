package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_345 {
    private final Production90_345 production = new Production90_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}