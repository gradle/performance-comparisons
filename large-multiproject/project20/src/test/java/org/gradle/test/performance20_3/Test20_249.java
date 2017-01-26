package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_249 {
    private final Production20_249 production = new Production20_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}