package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_52 {
    private final Production20_52 production = new Production20_52("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}