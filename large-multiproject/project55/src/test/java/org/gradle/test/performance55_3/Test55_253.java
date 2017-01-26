package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_253 {
    private final Production55_253 production = new Production55_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}