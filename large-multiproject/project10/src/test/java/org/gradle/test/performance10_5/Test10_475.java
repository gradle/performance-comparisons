package org.gradle.test.performance10_5;

import static org.junit.Assert.*;

public class Test10_475 {
    private final Production10_475 production = new Production10_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}