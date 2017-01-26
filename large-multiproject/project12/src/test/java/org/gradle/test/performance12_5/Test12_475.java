package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_475 {
    private final Production12_475 production = new Production12_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}