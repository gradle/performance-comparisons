package org.gradle.test.performance79_5;

import static org.junit.Assert.*;

public class Test79_434 {
    private final Production79_434 production = new Production79_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}