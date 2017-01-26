package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_394 {
    private final Production85_394 production = new Production85_394("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}