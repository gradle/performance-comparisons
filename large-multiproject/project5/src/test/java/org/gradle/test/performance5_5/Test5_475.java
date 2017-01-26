package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_475 {
    private final Production5_475 production = new Production5_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}