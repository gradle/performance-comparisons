package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_475 {
    private final Production93_475 production = new Production93_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}