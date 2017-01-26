package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_475 {
    private final Production89_475 production = new Production89_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}