package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_498 {
    private final Production55_498 production = new Production55_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}