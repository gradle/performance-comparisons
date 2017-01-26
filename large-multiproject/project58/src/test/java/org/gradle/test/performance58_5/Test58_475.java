package org.gradle.test.performance58_5;

import static org.junit.Assert.*;

public class Test58_475 {
    private final Production58_475 production = new Production58_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}