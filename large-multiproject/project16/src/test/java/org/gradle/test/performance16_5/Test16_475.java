package org.gradle.test.performance16_5;

import static org.junit.Assert.*;

public class Test16_475 {
    private final Production16_475 production = new Production16_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}