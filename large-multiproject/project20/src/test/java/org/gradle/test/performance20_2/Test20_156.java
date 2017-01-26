package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_156 {
    private final Production20_156 production = new Production20_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}