package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_21 {
    private final Production20_21 production = new Production20_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}