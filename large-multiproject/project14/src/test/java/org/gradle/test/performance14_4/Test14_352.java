package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_352 {
    private final Production14_352 production = new Production14_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}