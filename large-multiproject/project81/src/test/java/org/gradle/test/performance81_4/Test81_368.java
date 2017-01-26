package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_368 {
    private final Production81_368 production = new Production81_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}