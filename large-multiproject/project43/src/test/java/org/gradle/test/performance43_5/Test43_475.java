package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_475 {
    private final Production43_475 production = new Production43_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}