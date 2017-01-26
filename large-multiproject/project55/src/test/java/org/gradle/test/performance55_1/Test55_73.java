package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_73 {
    private final Production55_73 production = new Production55_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}