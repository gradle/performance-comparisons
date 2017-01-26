package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_122 {
    private final Production20_122 production = new Production20_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}