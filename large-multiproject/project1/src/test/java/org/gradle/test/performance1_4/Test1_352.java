package org.gradle.test.performance1_4;

import static org.junit.Assert.*;

public class Test1_352 {
    private final Production1_352 production = new Production1_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}