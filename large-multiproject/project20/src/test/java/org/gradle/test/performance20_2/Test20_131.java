package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_131 {
    private final Production20_131 production = new Production20_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}