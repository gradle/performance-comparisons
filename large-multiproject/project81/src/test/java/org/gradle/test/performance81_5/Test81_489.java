package org.gradle.test.performance81_5;

import static org.junit.Assert.*;

public class Test81_489 {
    private final Production81_489 production = new Production81_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}