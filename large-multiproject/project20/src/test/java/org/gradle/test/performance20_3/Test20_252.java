package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_252 {
    private final Production20_252 production = new Production20_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}