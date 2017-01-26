package org.gradle.test.performance80_5;

import static org.junit.Assert.*;

public class Test80_475 {
    private final Production80_475 production = new Production80_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}