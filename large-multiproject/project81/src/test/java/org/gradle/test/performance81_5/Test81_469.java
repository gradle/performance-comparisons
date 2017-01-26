package org.gradle.test.performance81_5;

import static org.junit.Assert.*;

public class Test81_469 {
    private final Production81_469 production = new Production81_469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}