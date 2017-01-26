package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_475 {
    private final Production25_475 production = new Production25_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}