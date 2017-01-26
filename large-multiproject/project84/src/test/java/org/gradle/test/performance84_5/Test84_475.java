package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_475 {
    private final Production84_475 production = new Production84_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}