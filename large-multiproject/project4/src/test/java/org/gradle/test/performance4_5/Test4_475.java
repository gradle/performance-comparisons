package org.gradle.test.performance4_5;

import static org.junit.Assert.*;

public class Test4_475 {
    private final Production4_475 production = new Production4_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}