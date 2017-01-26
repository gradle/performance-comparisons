package org.gradle.test.performance37_5;

import static org.junit.Assert.*;

public class Test37_434 {
    private final Production37_434 production = new Production37_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}