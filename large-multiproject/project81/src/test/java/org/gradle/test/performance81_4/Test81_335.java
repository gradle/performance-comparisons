package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_335 {
    private final Production81_335 production = new Production81_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}