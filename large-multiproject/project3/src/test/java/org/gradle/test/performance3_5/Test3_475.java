package org.gradle.test.performance3_5;

import static org.junit.Assert.*;

public class Test3_475 {
    private final Production3_475 production = new Production3_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}