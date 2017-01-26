package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_69 {
    private final Production20_69 production = new Production20_69("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}