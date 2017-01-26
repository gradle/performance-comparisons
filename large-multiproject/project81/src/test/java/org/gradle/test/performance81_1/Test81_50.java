package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_50 {
    private final Production81_50 production = new Production81_50("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}