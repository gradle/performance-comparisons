package org.gradle.test.performance20_5;

import static org.junit.Assert.*;

public class Test20_434 {
    private final Production20_434 production = new Production20_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}