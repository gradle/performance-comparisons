package org.gradle.test.performance20_5;

import static org.junit.Assert.*;

public class Test20_475 {
    private final Production20_475 production = new Production20_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}