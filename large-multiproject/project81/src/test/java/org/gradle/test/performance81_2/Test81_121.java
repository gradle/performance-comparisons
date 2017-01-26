package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_121 {
    private final Production81_121 production = new Production81_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}