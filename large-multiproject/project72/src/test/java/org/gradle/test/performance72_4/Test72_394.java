package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_394 {
    private final Production72_394 production = new Production72_394("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}