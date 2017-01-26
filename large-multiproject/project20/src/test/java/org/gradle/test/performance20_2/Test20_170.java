package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_170 {
    private final Production20_170 production = new Production20_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}