package org.gradle.test.performance35_5;

import static org.junit.Assert.*;

public class Test35_475 {
    private final Production35_475 production = new Production35_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}