package org.gradle.test.performance55_3;

import static org.junit.Assert.*;

public class Test55_207 {
    private final Production55_207 production = new Production55_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}