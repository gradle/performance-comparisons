package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_434 {
    private final Production25_434 production = new Production25_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}