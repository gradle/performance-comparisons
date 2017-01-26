package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_434 {
    private final Production39_434 production = new Production39_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}