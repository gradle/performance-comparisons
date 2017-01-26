package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_439 {
    private final Production19_439 production = new Production19_439("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}