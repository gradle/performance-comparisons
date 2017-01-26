package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_434 {
    private final Production18_434 production = new Production18_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}