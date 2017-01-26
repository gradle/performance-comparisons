package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_193 {
    private final Production20_193 production = new Production20_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}