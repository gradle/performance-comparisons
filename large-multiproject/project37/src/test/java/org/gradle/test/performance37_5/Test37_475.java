package org.gradle.test.performance37_5;

import static org.junit.Assert.*;

public class Test37_475 {
    private final Production37_475 production = new Production37_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}