package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_383 {
    private final Production81_383 production = new Production81_383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}