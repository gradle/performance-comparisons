package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_434 {
    private final Production7_434 production = new Production7_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}