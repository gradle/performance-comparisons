package org.gradle.test.performance58_5;

import static org.junit.Assert.*;

public class Test58_434 {
    private final Production58_434 production = new Production58_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}