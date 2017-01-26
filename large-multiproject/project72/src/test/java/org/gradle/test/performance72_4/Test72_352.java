package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_352 {
    private final Production72_352 production = new Production72_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}