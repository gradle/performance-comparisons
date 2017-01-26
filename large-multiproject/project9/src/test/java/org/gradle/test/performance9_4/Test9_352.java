package org.gradle.test.performance9_4;

import static org.junit.Assert.*;

public class Test9_352 {
    private final Production9_352 production = new Production9_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}