package org.gradle.test.performance85_5;

import static org.junit.Assert.*;

public class Test85_433 {
    private final Production85_433 production = new Production85_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}