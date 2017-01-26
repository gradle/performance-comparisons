package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_205 {
    private final Production20_205 production = new Production20_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}