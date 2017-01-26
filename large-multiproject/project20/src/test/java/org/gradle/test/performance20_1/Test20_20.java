package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_20 {
    private final Production20_20 production = new Production20_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}