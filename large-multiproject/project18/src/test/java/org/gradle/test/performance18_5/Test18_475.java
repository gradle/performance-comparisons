package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_475 {
    private final Production18_475 production = new Production18_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}