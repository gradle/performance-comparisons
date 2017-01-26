package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_213 {
    private final Production90_213 production = new Production90_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}