package org.gradle.test.performance81_5;

import static org.junit.Assert.*;

public class Test81_433 {
    private final Production81_433 production = new Production81_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}