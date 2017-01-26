package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_70 {
    private final Production20_70 production = new Production20_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}