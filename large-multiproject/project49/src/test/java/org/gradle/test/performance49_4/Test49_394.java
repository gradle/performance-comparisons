package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_394 {
    private final Production49_394 production = new Production49_394("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}