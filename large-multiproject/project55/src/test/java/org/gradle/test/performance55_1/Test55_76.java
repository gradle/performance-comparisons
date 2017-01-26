package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_76 {
    private final Production55_76 production = new Production55_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}