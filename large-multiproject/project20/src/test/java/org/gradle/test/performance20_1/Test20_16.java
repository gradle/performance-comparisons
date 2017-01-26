package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_16 {
    private final Production20_16 production = new Production20_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}