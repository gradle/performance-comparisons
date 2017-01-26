package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_187 {
    private final Production20_187 production = new Production20_187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}