package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_375 {
    private final Production81_375 production = new Production81_375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}