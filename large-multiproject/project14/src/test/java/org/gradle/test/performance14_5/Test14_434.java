package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_434 {
    private final Production14_434 production = new Production14_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}