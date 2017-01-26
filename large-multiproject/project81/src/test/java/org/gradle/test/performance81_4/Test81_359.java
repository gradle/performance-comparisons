package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_359 {
    private final Production81_359 production = new Production81_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}