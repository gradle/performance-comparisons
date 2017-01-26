package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_210 {
    private final Production20_210 production = new Production20_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}