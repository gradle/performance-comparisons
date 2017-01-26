package org.gradle.test.performance41_5;

import static org.junit.Assert.*;

public class Test41_475 {
    private final Production41_475 production = new Production41_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}