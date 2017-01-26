package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_64 {
    private final Production20_64 production = new Production20_64("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}