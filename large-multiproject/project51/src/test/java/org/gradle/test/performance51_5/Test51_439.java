package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_439 {
    private final Production51_439 production = new Production51_439("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}