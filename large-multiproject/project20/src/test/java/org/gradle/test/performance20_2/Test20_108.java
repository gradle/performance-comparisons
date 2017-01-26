package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_108 {
    private final Production20_108 production = new Production20_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}