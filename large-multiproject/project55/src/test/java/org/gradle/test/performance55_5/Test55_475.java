package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_475 {
    private final Production55_475 production = new Production55_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}