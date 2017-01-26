package org.gradle.test.performance81_5;

import static org.junit.Assert.*;

public class Test81_451 {
    private final Production81_451 production = new Production81_451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}