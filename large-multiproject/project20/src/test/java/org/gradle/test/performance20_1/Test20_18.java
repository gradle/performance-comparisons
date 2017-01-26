package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_18 {
    private final Production20_18 production = new Production20_18("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}