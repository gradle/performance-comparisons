package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_394 {
    private final Production15_394 production = new Production15_394("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}