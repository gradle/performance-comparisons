package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_475 {
    private final Production86_475 production = new Production86_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}