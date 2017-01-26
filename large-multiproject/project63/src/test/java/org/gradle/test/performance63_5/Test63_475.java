package org.gradle.test.performance63_5;

import static org.junit.Assert.*;

public class Test63_475 {
    private final Production63_475 production = new Production63_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}