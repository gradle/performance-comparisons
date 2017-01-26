package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_434 {
    private final Production99_434 production = new Production99_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}