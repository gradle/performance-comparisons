package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_146 {
    private final Production20_146 production = new Production20_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}