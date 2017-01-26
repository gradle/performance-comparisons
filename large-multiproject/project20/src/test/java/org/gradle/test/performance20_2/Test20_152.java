package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_152 {
    private final Production20_152 production = new Production20_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}