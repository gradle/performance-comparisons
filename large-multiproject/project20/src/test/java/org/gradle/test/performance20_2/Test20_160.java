package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_160 {
    private final Production20_160 production = new Production20_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}