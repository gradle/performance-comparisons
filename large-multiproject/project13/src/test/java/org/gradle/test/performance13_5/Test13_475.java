package org.gradle.test.performance13_5;

import static org.junit.Assert.*;

public class Test13_475 {
    private final Production13_475 production = new Production13_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}