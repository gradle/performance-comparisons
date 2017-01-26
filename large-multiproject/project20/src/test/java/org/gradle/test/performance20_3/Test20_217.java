package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_217 {
    private final Production20_217 production = new Production20_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}