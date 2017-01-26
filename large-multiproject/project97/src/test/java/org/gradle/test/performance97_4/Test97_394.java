package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_394 {
    private final Production97_394 production = new Production97_394("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}