package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_475 {
    private final Production48_475 production = new Production48_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}