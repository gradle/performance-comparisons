package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_283 {
    private final Production20_283 production = new Production20_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}