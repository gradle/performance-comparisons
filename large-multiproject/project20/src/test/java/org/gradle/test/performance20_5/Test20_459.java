package org.gradle.test.performance20_5;

import static org.junit.Assert.*;

public class Test20_459 {
    private final Production20_459 production = new Production20_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}