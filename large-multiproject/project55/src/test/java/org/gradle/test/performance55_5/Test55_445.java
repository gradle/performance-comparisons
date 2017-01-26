package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_445 {
    private final Production55_445 production = new Production55_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}