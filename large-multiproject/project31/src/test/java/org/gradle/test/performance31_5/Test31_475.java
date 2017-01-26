package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_475 {
    private final Production31_475 production = new Production31_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}