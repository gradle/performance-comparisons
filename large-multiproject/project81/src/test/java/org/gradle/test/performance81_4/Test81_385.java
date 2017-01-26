package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_385 {
    private final Production81_385 production = new Production81_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}