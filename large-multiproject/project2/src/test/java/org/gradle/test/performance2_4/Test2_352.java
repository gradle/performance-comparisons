package org.gradle.test.performance2_4;

import static org.junit.Assert.*;

public class Test2_352 {
    private final Production2_352 production = new Production2_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}