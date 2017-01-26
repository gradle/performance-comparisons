package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_345 {
    private final Production20_345 production = new Production20_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}