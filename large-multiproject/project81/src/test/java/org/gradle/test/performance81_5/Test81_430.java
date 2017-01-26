package org.gradle.test.performance81_5;

import static org.junit.Assert.*;

public class Test81_430 {
    private final Production81_430 production = new Production81_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}