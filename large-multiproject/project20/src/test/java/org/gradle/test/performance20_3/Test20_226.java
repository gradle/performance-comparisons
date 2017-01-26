package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_226 {
    private final Production20_226 production = new Production20_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}