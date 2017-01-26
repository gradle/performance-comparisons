package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_19 {
    private final Production20_19 production = new Production20_19("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}