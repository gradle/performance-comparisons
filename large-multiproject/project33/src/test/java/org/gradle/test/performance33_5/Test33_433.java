package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_433 {
    private final Production33_433 production = new Production33_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}