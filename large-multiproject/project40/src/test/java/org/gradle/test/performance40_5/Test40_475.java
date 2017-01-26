package org.gradle.test.performance40_5;

import static org.junit.Assert.*;

public class Test40_475 {
    private final Production40_475 production = new Production40_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}