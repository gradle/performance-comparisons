package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_383 {
    private final Production85_383 production = new Production85_383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}