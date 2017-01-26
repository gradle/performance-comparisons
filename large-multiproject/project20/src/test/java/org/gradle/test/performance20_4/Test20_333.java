package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_333 {
    private final Production20_333 production = new Production20_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}