package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_434 {
    private final Production22_434 production = new Production22_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}