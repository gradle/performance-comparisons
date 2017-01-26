package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_355 {
    private final Production81_355 production = new Production81_355("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}