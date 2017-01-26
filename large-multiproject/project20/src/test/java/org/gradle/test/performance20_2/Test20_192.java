package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_192 {
    private final Production20_192 production = new Production20_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}