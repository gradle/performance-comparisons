package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_352 {
    private final Production19_352 production = new Production19_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}