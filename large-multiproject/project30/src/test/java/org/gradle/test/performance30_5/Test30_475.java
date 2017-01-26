package org.gradle.test.performance30_5;

import static org.junit.Assert.*;

public class Test30_475 {
    private final Production30_475 production = new Production30_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}