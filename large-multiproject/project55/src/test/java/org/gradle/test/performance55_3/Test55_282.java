package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_282 {
    private final Production55_282 production = new Production55_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}