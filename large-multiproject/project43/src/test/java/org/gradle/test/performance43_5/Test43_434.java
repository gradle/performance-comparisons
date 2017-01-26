package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_434 {
    private final Production43_434 production = new Production43_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}