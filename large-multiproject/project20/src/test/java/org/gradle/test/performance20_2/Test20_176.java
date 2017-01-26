package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_176 {
    private final Production20_176 production = new Production20_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}