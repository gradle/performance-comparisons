package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_190 {
    private final Production20_190 production = new Production20_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}