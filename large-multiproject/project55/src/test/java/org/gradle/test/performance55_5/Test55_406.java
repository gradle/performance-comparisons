package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_406 {
    private final Production55_406 production = new Production55_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}