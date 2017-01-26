package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_247 {
    private final Production20_247 production = new Production20_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}