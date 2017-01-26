package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_429 {
    private final Production60_429 production = new Production60_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}