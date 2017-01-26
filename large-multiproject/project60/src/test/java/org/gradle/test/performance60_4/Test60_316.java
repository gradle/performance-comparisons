package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_316 {
    private final Production60_316 production = new Production60_316("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}