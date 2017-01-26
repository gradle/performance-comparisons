package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_9 {
    private final Production55_9 production = new Production55_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}