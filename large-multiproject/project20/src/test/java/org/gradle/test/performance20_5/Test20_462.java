package org.gradle.test.performance20_5;

import static org.junit.Assert.*;

public class Test20_462 {
    private final Production20_462 production = new Production20_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}