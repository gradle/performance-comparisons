package org.gradle.test.performance81_5;

import static org.junit.Assert.*;

public class Test81_434 {
    private final Production81_434 production = new Production81_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}