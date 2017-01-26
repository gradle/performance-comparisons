package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_327 {
    private final Production81_327 production = new Production81_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}