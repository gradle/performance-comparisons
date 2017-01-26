package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_475 {
    private final Production75_475 production = new Production75_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}