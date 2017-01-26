package org.gradle.test.performance47_5;

import static org.junit.Assert.*;

public class Test47_475 {
    private final Production47_475 production = new Production47_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}