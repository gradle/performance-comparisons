package org.gradle.test.performance88_5;

import static org.junit.Assert.*;

public class Test88_475 {
    private final Production88_475 production = new Production88_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}