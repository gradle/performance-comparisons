package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_381 {
    private final Production20_381 production = new Production20_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}