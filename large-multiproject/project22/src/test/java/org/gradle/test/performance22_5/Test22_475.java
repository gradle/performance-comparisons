package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_475 {
    private final Production22_475 production = new Production22_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}