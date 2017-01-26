package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_394 {
    private final Production60_394 production = new Production60_394("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}