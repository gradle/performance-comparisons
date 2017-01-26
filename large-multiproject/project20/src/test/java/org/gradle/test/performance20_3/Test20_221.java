package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_221 {
    private final Production20_221 production = new Production20_221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}