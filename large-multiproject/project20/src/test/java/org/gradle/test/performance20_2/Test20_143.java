package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_143 {
    private final Production20_143 production = new Production20_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}