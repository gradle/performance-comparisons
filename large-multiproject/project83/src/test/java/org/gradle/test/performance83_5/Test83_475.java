package org.gradle.test.performance83_5;

import static org.junit.Assert.*;

public class Test83_475 {
    private final Production83_475 production = new Production83_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}