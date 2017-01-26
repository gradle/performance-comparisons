package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_433 {
    private final Production11_433 production = new Production11_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}