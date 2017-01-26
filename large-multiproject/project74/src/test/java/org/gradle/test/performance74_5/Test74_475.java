package org.gradle.test.performance74_5;

import static org.junit.Assert.*;

public class Test74_475 {
    private final Production74_475 production = new Production74_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}