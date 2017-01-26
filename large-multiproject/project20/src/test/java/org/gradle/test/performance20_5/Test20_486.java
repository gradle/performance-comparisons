package org.gradle.test.performance20_5;

import static org.junit.Assert.*;

public class Test20_486 {
    private final Production20_486 production = new Production20_486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}